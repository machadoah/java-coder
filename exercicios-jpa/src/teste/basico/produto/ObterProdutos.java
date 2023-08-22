package teste.basico.produto;

import java.util.List;

import infraestrutura.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {

		ProdutoDAO pdao = new ProdutoDAO();

		List<Produto> produtos = pdao.obterTodos();

		for (Produto produto : produtos) {
			System.out.println("Id = " + produto.getId() + " - Nome = " + produto.getNome());
		}

		double precoTotal = produtos.stream().map(produto -> produto.getPreco()).reduce(0.0, (t, p) -> t + p)
				.doubleValue();

		System.out.println("O valor total is: " + precoTotal);
	}
}
