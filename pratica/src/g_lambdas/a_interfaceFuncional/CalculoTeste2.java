package g_lambdas.a_interfaceFuncional;

public class CalculoTeste2 {

	public static void main(String[] args) {

		// Estrutura de uma função Lambda
		Calculo calc = (a, b) -> {
			return a + b;
		};

		System.out.println(calc.executar(2, 3));
		
		// Estrutura de uma função Lambda, com apenas 1 instrução
		calc = (a,b) -> a * b; 
		
		System.out.println(calc.executar(2, 3));
		System.out.println(calc.legal());
	}

}
