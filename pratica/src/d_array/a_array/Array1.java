package d_array.a_array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int tamanho = 5;

		double[] notasAlunoA = new double[tamanho];

		double somatoria = 0;
		
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.printf("Insira a nota numero [%d] de [%d] totais: ", i+1, tamanho);
			notasAlunoA[i] = input.nextDouble();

			somatoria += notasAlunoA[i];
		}
		
		double media = somatoria / notasAlunoA.length;
		
		System.out.printf("Sua media equivale a %.2f", media);
		
		input.close();
	}

}
