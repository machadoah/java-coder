package c_introducaoOO.z_desafioModulo;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	String apresentar() {
		return String.format("Ola me chamo %s e tenho %.2f kilos.", this.nome, this.peso);
	}
	
	void comer(Comida comida) {
		this.peso += comida.peso;
	}

}
