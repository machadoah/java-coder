package g_lambdas.e_funcao;

import java.util.function.Function;

public class DesafioProprio {

	public static void main(String[] args) {
		
		//  Funcao que verifica se o numero é igual a 5
		Function<Integer, String> isFive = numero -> {
			if(numero == 5) {
				return "sim";
			} else {
				return "nao";
			}
		};
		
		// Função que devolve o fatorial
		Function<Integer, Integer> fatorial = numero -> {
			int fat = 1;
			for(; numero >= 2; numero --) {
				fat *= numero;
			}
			return fat;
		};
		
		System.out.println(fatorial.apply(5));
		System.out.println(isFive.apply(3));
		System.out.println(isFive.apply(5));
		

	}

}
