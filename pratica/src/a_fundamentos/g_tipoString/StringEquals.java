package a_fundamentos.g_tipoString;

import java.util.Scanner;

public class StringEquals {
	
	// Necessário comparar strings através dos equals!!!!
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2"); // True
		
		String s = new String("2");
		
		System.out.println("2" == s); // False
		
		System.out.println("2".equalsIgnoreCase(s));
		
		Scanner sc = new Scanner(System.in);
		
		String string1 = sc.next();
		System.out.println("2".equals(string1.trim())); // trim -> remove os espaços!
		
		sc.close();
		
		// Next() -> remove os espaços em branco
		// NextLine() -> Não remove os espaços em branco
		
	}

}
