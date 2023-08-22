package l_bdJDBC.h_excluirRegistro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import l_bdJDBC.c_fabricaConexao.ConnectionFactory;

public class ExluirPessoa {

	public static void main(String[] args) throws SQLException{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o codigo: ");
		int id = input.nextInt();
		
		Connection connection = ConnectionFactory.getConnection();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);
		
		if(statement.executeUpdate() > 0){
			System.out.println("O usuario foi excluido!");
		} else {
			System.out.println("Nada foi efetuado!");
		}
		
		input.close();
		connection.close();
	}
}
