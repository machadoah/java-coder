package c_introducaoOO.a_classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.889);

		Produto p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();

		System.out.printf("O valor final do %s eh de R$ %.2f", p1.nome, precoFinal1);
		System.out.printf("\nO valor final do %s eh de R$ %.2f", p2.nome, precoFinal2);

	}

}
