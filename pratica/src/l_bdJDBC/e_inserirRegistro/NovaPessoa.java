package l_bdJDBC.e_inserirRegistro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import l_bdJDBC.c_fabricaConexao.ConnectionFactory;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {

		// Abrea a conexão
		Connection connection = ConnectionFactory.getConnection();

		// Instancia o Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Insira um nome: ");
		String nome = input.nextLine();

		String sql = """
				INSERT INTO pessoas (nome) VALUES (?);
				""";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, nome);

		/*
		 * Com perparedSatatement estou preparando a declaração para o banco de dados.
		 * Por ser uma string é usado o método setString e 1 pois é para o primeiro ?, e
		 * nome pois o dado será encminhado para a coluna nome.
		 * 
		 */
		
		statement.execute();
		
		System.out.println("Pessoa incluida com sucesso!");

		// Fecha o scanner e conexão
		input.close();
		connection.close();
	}

}
