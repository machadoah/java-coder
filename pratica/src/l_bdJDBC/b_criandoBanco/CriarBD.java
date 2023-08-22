package l_bdJDBC.b_criandoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBD {

	public static void main(String[] args) throws SQLException {

		final String url = "jdbc:mysql://localhost";
		final String user = "root";
		final String password = "2705";

		Connection conexao = DriverManager.getConnection(url, user, password);

		Statement statement = conexao.createStatement();
		statement.execute("CREATE DATABASE IF NOT EXISTS curso_java"); // Aqui será inserido o comando SQL
		
		// statement.execute("DROP DATABASE IF EXISTS curso_java2");

		/*
		 * Statement é a declaração SQL! com o método execute é executado o comando
		 * recebido como paramentro
		 */

		System.out.println("Banco criado com sucesso");

		conexao.close();
	}

}
