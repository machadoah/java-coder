package g_lambdas.g_unaryOperator;

import java.util.function.UnaryOperator;

public class OperadorUnitario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n+2;
		UnaryOperator<Integer> vezesDois = n -> n*2;
		UnaryOperator<Integer> aoQuadrado = n -> (int)(Math.pow(n, 2));
		
		System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0));
		// 0 + 2 -> 2 * 2 -> 4^2 -> 16
		
		System.out.println(maisDois.compose(vezesDois).compose(aoQuadrado).apply(0));
		// 0 ^(2) -> 0 * 2 -> 0 + 2 -> 2
		// Executa na ordem inversa
	}

}
