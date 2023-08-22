package l_bdJDBC.f_consultarRegistro;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import l_bdJDBC.c_fabricaConexao.ConnectionFactory;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();

		String sql = """
				SELECT * FROM pessoas
				""";

		Statement statement = connection.createStatement();
		ResultSet resultado = statement.executeQuery(sql);

		/*
		 * O resultSet é utilizando para armazenar o conjunto de dados apos a execução
		 * da query SQL.
		 */

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}

		/*
		 * Enquanto exister valor (linha) proximo em resulatado (i.e. ReusltSet) int
		 * codigo recebe o valor da coluna 'codigo' e String nome recebe de 'nome'.
		 * Atraves desses dados é instanciado uma nova pessoas, na lista de Pessoas.
		 */

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
		}
	}

}
