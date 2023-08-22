package a_fundamentos.i_conversaoTipos;

import java.util.Scanner;

public class Exercicios_Conversao {

	public static void main(String[] args) {

		/*
		 * Receber no scanner o 3 ultimos salários de uma pessoa, e fornecer a média.
		 * 
		 * Devendo funcionar tanto com ',' como '.'
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o seu primeiro salario: ");
		String s1 = sc.nextLine().replace(",", ".");
		
		System.out.print("Insira o seu segundo salario: ");
		String s2 = sc.nextLine().replace(",", ".");
		
		System.out.print("Insira o seu terceiro salario: ");
		String s3 = sc.nextLine().replace(",", ".");

		double sal1 = Double.parseDouble(s1);
		double sal2 = Double.parseDouble(s2);
		double sal3 = Double.parseDouble(s3);
	
		double media = (sal1 + sal2 + sal3)/3;
		
		System.out.printf("A media dos salarios equivale a R$ %.2f", media);
		
		sc.close();
	}

}
