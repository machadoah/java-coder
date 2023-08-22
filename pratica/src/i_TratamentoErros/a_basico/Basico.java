package i_TratamentoErros.a_basico;

import h_streamAPI.d_filter.Aluno;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;
		
		// Com try catch ele passa pele erro!

		try {
			imprimirAluno(a1); // NullPointException
		} catch (Exception exception) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario.");
		}
		
		try {
			System.out.println(7 / 0); // ArithmeticException: / by zero
		} catch (ArithmeticException e) {
			// e.printStackTrace(); -> imprime as linhas da pilha!
			System.out.println("Not is possible dividir for zero. -> " + e.getMessage());;
		}

		System.out.println("Fim do programa");
	}

	static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.getNome());
	}

}
