package l_bdJDBC.f_consultarRegistro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import l_bdJDBC.c_fabricaConexao.ConnectionFactory;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {

		Connection connection = ConnectionFactory.getConnection();
		Scanner input = new Scanner(System.in);

		System.out.print("Insira um nome que deseja buscar no Banco de Dados: ");
		String valor = input.nextLine();

		String sql = """
				SELECT * FROM pessoas where nome like ?
				""";

		/*
		 * O ? no SQL será executado poesteriormente como %?% na propria declaração. o
		 * like seleciona os elementos que possuem aquele trecho.
		 */

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "%" + valor + "%");

		/*
		 * Nestas linhas,estamos preparando uma declaração SQL utilizando um objeto
		 * PreparedStatement. O parâmetro sql representa a consulta SQL que será
		 * executada posteriormente.
		 * 
		 * na linha de baixo estamos configurando um parâmetro na consulta preparada. O
		 * método setString é usado para definir um valor de string para um determinado
		 * parâmetro na consulta. Nesse caso, estamos definindo o valor do primeiro
		 * parâmetro como uma string que contém o caractere de porcentagem (%) antes e
		 * depois da variável valor. O caractere de porcentagem é um curinga que
		 * representa qualquer sequência de caracteres.
		 */

		ResultSet resultado = statement.executeQuery();
		/*
		 * Nesta linha, estamos executando a consulta preparada e armazenando o
		 * resultado em um objeto ResultSet. O método executeQuery() é usado para
		 * executar a consulta SQL e retornar os resultados como um conjunto de dados
		 * tabular.
		 */

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
		}

		input.close();
		connection.close();
		statement.close();
	}
}
