package a_fundamentos.j_operadores;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// Pos-fixada
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		// Pre-fixada
		
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--);
		
		// ++a tem maior precedencia que ==, e b-- tem menor precendencia que ==
		// 2 == 2 -> durante a execução
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
