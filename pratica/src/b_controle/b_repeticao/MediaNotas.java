package b_controle.b_repeticao;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double nota = 0;
		double somatoria = 0;
		int i = 0;

		while (nota != -1) {

			System.out.print("Insira uma nota: (ou -1 para sair)");
			nota = input.nextDouble();

			if (nota >= 0 && nota <= 10) {

				somatoria += nota;
				i++;
			} else if (nota == -1) {
				System.out.println("Calculando media ...");
			} else {

				System.out.println("Nota invalida!");
			}

		}

		double media = somatoria / i;

		System.out.println("A media das notas equivale a " + media);

		input.close();
	}

}
