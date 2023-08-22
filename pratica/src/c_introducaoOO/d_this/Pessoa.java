package c_introducaoOO.d_this;

public class Pessoa {

	String nome;
	int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome; // Uso o this para me referir a um atributo da instancia
		this.idade = idade;
	}
	
	public Pessoa() {
		this("Nome", 0); // Uso o this() para usar um construtor dentro de outro
	}

	public void falar() {
		System.out.println("Ola, meu nome eh " + nome + " e tenho " + idade + " anos.");
	}

}
