package a_fundamentos.f_import;

import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Vou utilizar import scanner
		
		System.out.print("Digite seu nome: ");
		String meuNome = sc.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String meuSobrenome = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int minhaIdade = sc.nextInt();
		
		String nomeCompleto = meuNome.concat(" " + meuSobrenome);
		
		System.out.printf("\nMuito prazer %s, voce tem %d anos.", nomeCompleto, minhaIdade);
		
		sc.close(); // Fechando o scanner utilizado!
		
	}

}
