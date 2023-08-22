package d_array.b_matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		double total = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Quantos alunos? ");
		int quantidadeAlunos = input.nextInt();

		System.out.print("Quantas notas por aluno? ");
		int quantidadeNotas = input.nextInt();

		double[][] notasTurma = new double[quantidadeAlunos][quantidadeNotas];

		for (int i = 0; i < notasTurma.length; i++) {
			for (int j = 0; j < notasTurma[i].length; j++) {

				System.out.printf("Informe a nota %d do aluno %d: ", (i+1), (j+1));
				notasTurma[i][j] = input.nextDouble();
				total += notasTurma[i][j];

			}
		}

		System.out.println("A media da turma corresponde a: " + (total / (quantidadeAlunos * quantidadeNotas)));

		for (double[] notaAluno : notasTurma) {
			System.out.println(Arrays.toString(notaAluno));
		}

		input.close();

	}

}
