package c_introducaoOO.a_classe;

public class Produto {
	
	// Atributos
	String nome;
	double preco;
//	double desconto;
	static double desconto = 0.25; 
	
	// Construtores
	Produto (String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	Produto (){
		
	}
	
	// Métodos
	
	double precoComDesconto() {
		return preco * (1 - Produto.desconto);
	}

}
