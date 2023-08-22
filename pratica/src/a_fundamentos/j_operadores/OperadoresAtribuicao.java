package a_fundamentos.j_operadores;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		int a = 3; 
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		c %= 2; // c = c % 2; -> resulta em '0' ou '1'
		
		System.out.println(c);
		
		
	}

}
