package c_introducaoOO.d_this;

public class ValorVsReferencia {

	public static void main(String[] args) {
		int a = 5;
		int b = a; // Atribuição via valor
		b = 10;
		System.out.println(a); // Imprime 5
		System.out.println(b); // Imprime 10

		Pessoa pessoa1 = new Pessoa("João", 25);
		Pessoa pessoa2 = pessoa1; // Atribuição via referência
		pessoa2.nome = "Maria";
		System.out.println(pessoa1.nome); // Imprime "Maria"
		System.out.println(pessoa2.nome); // Imprime "Maria"
	}

}
