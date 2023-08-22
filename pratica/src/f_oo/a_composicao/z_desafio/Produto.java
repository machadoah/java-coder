package f_oo.a_composicao.z_desafio;

public class Produto {

	// Atributos
	String nome;
	double preco;

	// Construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	// obtem valor
	double obtemValorProduto() {
		return this.preco;
	}

}
