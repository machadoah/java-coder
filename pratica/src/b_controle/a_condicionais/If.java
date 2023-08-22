package b_controle.a_condicionais;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a media: ");
		double media = sc.nextDouble();

		if (media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns");
		} else if (media < 7 && media >= 5) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}

		sc.close();

	}

}
