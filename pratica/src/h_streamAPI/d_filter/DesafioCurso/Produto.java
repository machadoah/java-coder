package h_streamAPI.d_filter.DesafioCurso;

public class Produto {

	final String nome;
	final double preco;
	final double desconto;
	final boolean freteGratis;

	public Produto(String nome, double preco, double desconto, boolean freteGratis) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.freteGratis = freteGratis;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public boolean getFreteGratis() {
		return freteGratis;
	}

}
