package g_lambdas.e_funcao;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "impar";

		System.out.println(parOuImpar.apply(5));
		System.out.println(parOuImpar.apply(32));

		Function<String, String> theResultIs = value -> "O resultado eh: " + value;

		Function<String, String> empolgado = valor -> valor + "!!!";

		Function<String, String> duvida = valor -> valor + "???";

		String resultadoFinal = parOuImpar.andThen(theResultIs).andThen(empolgado).apply(32);
		String resultadoFinal2 = parOuImpar.andThen(theResultIs).andThen(duvida).apply(32);
		System.out.println(resultadoFinal);
		System.out.println(resultadoFinal2);

		System.out.println(empolgado.apply("joao"));

	}

}
