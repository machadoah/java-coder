package g_lambdas.z_DesafioBinaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ProdutoDesafio {

	public static void main(String[] args) {

		// Preco com desconto
		Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);

		// Imposto Municipal
		UnaryOperator<Double> impostoMunicipal = preco -> {
			return (preco >= 2500 ? preco * 1.085 : preco);
		};

		// Frete -> recebe o valor já com imposto!
		UnaryOperator<Double> frete = preco -> {
			return (preco >= 3000 ? preco + 100.0 : preco + 50.0);
		};

		// Arrendondar -> recebe o valor pós frete!
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));

		// Formatar
		Function<Double, String> formatar = preco -> {
			return ("R$" + preco).replace(".", ",");
		};

		Produto produto = new Produto("Notebook", 3235.89, 0.13);

		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar)
				.apply(produto);
		
		System.out.println(preco);
	}
}
