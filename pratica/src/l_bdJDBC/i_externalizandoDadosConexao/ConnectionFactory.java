package l_bdJDBC.i_externalizandoDadosConexao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	public static Connection getConnection() {

		try {
			Properties properties = getProperties();
			final String url = properties.getProperty("banco.url");
			final String user = properties.getProperty("banco.usuario");
			final String password = properties.getProperty("banco.senha");

			return DriverManager.getConnection(url, user, password);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties properties = new Properties();
		String caminho = "/l_bdJDBC/i_externalizandoDadosConexao/conexao.properties";
		properties.load(ConnectionFactory.class.getResourceAsStream(caminho));
		return properties;
	}

}
