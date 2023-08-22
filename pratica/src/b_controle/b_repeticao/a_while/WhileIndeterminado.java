package b_controle.b_repeticao.a_while;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = "";

		// Enquando 's' != de "sair" continua perguntando
		while (!(s.trim().equalsIgnoreCase("sair"))) {
			System.out.print("Digite algo: ");
			s = sc.nextLine();
		}

		sc.close();

	}

}
