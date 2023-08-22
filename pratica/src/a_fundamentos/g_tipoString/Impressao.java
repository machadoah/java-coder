package a_fundamentos.g_tipoString;

public class Impressao {

	public static void main(String[] args) {

		var nome = "Pedro";
		var sobrenome = "Gonzaga";
		var idade = 33;
		var salario = 12345.769;

		System.out.printf("Nome: %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);

		/*
		 * %s -> string
		 * 
		 * %d -> inteiro
		 * 
		 * %f -> real
		 */
	}

}
