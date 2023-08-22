package l_bdJDBC.a_criandoConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {

		// Dados necesários para a conexão
		// final String url = "jdbc:mysql://localhost:3306";
		// final String url =
		// "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String pass = "2705";

		/*
		 * Quando a porta do banco mão esta declarada de forma explicita é usada a
		 * padrão 3306.
		 * 
		 * ... localhost/{aqui} ... representa qual banco de dados será usado na
		 * manipulação dos dados.
		 * 
		 * SSL representa uma conexão segura com o Banco de dados. É recomendavel ser
		 * true.
		 */

		// Realiza a conexão com o bando de dados
		Connection conexao = DriverManager.getConnection(url, user, pass);

		System.out.println("Conexao realizada com sucesso!");

		conexao.close();
	}

}
