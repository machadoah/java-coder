package a_fundamentos.j_operadores;

public class Exercicio_Aritmeticos {

	public static void main(String[] args) {

		/*
		 * int a = 3 * 4 - 10; int b = (int) Math.pow(a, 3);
		 * 
		 * System.out.println(b);
		 */

		double superiorEsqA = 6;
		double superiorEsqB = 3 + 2;

		double superiorEsqTotal = Math.pow((superiorEsqA * superiorEsqB), 2);

		double inferiorEsquerdo = 3 * 2;

		double totalEsquerdo = superiorEsqTotal / inferiorEsquerdo;

		// System.out.println("O lado superior esquerdo resulta em: " + totalEsquerdo);

		double superiorDirA = (1 - 5);
		double superiorDirB = 2 - 7;

		double superiorDir = superiorDirA * superiorDirB;
		double direita = superiorDir / 2;

		double totalDireita = Math.pow(direita, 2);

		// System.out.println("O lado superior direito resulta em: " + totalDireita);

		double totalSuperior = Math.pow(totalEsquerdo - totalDireita, 3);

		// System.out.println(totalSuperior);

		double TotalInferior = Math.pow(10, 3);

		double resultadoFinal = totalSuperior / TotalInferior;

		System.out.println("A equacao resulta em: " + (int) resultadoFinal);

	}

}
