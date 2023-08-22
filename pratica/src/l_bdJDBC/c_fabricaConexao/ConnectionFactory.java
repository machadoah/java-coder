package l_bdJDBC.c_fabricaConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {

		try {
			final String url = "jdbc:mysql://localhost/curso_java";
			final String user = "root";
			final String password = "2705";

			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
