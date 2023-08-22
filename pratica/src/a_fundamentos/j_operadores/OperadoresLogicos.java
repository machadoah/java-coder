package a_fundamentos.j_operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {

		boolean cond1 = true;
		boolean cond2 = 3 > 7;
		
		// Operadores binários
		System.out.println(cond1 && cond2); // E
		System.out.println(cond1 || cond2); // OU
		System.out.println(cond1 ^ cond2); // XOR
		
		// Operadores unários
		System.out.println(!cond1); // Não
		System.out.println(!cond2);
		
	}

}
