package g_lambdas.b_foreachFuncional;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println("Foreach tradicional");
		// Forma tradicional
		for (String aprovado : aprovados) {
			System.out.println(aprovado);
		}

		System.out.println("\nLambda #01");
		// Forma lambda
		aprovados.forEach(aprovado -> System.out.println(aprovado + " <- Lambda"));
		
		System.out.println("\nLambda #02");
		// Forma lambda
		aprovados.forEach(aprovado -> meuImprimir(aprovado));
		
		System.out.println("\nMethod Reference #01");
		// Method Reference
		aprovados.forEach(System.out::println); 
		
		System.out.println("\nMethod Reference #02");
		// Method Reference
		aprovados.forEach(Foreach::meuImprimir); 
	}
	
	// Função
	static void meuImprimir(String nome) {
		System.out.println("Oi, meu nome eh " + nome);
	}

}
