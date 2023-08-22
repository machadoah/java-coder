package l_bdJDBC.i_externalizandoDadosConexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import l_bdJDBC.f_consultarRegistro.Pessoa;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();

		String sql = """
				SELECT * FROM pessoas
				""";

		Statement statement = connection.createStatement();
		ResultSet resultado = statement.executeQuery(sql);

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}


		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
		}
	}

}
