package l_bdJDBC.g_atualizarRegistro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import l_bdJDBC.c_fabricaConexao.ConnectionFactory;
import l_bdJDBC.f_consultarRegistro.Pessoa;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner input = new Scanner(System.in);

		System.out.print("Insira o id da pessoa que voce deseja altera: ");
		int id = input.nextInt();

		String sql = "SELECT * FROM pessoas WHERE codigo = ?";
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);
		
		ResultSet resultado = statement.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));
		
			System.out.println("O nome atual is: " + p.getNome());
			input.nextLine(); //
			
			System.out.print("Informe um novo nome: ");
			String newName = input.nextLine();
			
			sql = """
				UPDATE pessoas SET nome = ? WHERE codigo = ? ;
				""";
			
			statement = connection.prepareStatement(sql);
			statement.setString(1, newName);
			statement.setInt(2, id);
			statement.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
		} else {
			System.out.println("Pessoa nao encontrada!");
		}
		
		connection.close();
		input.close();
	}

}
