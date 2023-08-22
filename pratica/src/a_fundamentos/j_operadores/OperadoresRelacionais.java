package a_fundamentos.j_operadores;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		int a = 65;
		int b = 'A';
		
		System.out.println(a == b);
		
		System.out.println(3 > 4);	// Maior que
		System.out.println(3 >= 4);	// Maior ou igual a
		System.out.println(3 < 4);	// Menor que
		System.out.println(3 <= 4);	// Menor ou igual a
		System.out.println(3 != 4); // Diferente de
		System.out.println(3 == 4); // Igual a
		
		double nota = 7.3;
		boolean bomComportamento =  true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
	}

}
