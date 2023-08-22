package b_controle.b_repeticao.a_while;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String text = "";
		
		do { // Só é vericado a condição depois da 1ª execução!
			
			System.out.println("Diga as palavras magicas! ... ");
			System.out.print("Quer sair?");
			
			text = input.nextLine();

		} while (!(text.equalsIgnoreCase("por favor")));
		
		System.out.println("Obrigado! voce disse " + text );

		input.close();
	}

}
