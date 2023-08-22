package g_lambdas.c_predicate.a_composicaoComPredicado;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = numero -> numero % 2 == 0;
		Predicate<Integer> isTresDigitos = numero -> numero >= 100 && numero <= 999;
		
		System.out.println(isPar.test(23));
		System.out.println(isPar.and(isTresDigitos).test(23));
		System.out.println(isPar.test(232));
		System.out.println(isPar.and(isTresDigitos).test(232));
		
		// posso usar os métodos and, or, negate etc...
		
		
	}

}
