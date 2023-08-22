package a_fundamentos.j_operadores;

public class OperadoresTernarios {

	public static void main(String[] args) {

		// Atribuição condicional

		double media = 7.6;

		// variavel = condição ? true : false
		String resultado = media >= 7.0 ? "aprovado" : "reprovado";

		System.out.printf("O aluno esta %s", resultado);

	}

}
