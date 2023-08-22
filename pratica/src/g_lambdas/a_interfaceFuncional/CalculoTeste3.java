package g_lambdas.a_interfaceFuncional;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// Double

		BinaryOperator<Double> calc = (a, b) -> {
			return a + b;
		};
		
		System.out.println(calc.apply(2.0, 3.0));

		//
		calc = (a, b) -> {
			return a * b;
		};
		
		System.out.println(calc.apply(2.0, 3.0));
		
		// Integer
		
		BinaryOperator<Integer> calc2 = (a, b) -> {
			return a + b;
		};
		
		System.out.println(calc2.apply(2, 3));
		
		//
		calc2 = (a, b) -> {
			return a * b;
		};
		
		System.out.println(calc2.apply(2, 3));
	}

}
