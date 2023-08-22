package h_streamAPI.c_Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Mapa2 {

	public static void main(String[] args) {

		Consumer<Object> println = System.out::println;

		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

		// cria um outra Lista com as marcas UpperCase
		marcas.stream().map(m -> m.toUpperCase()).forEach(println);

		System.out.println("\nUsando composicao!");

		marcas.stream().map(Utilitarios.maiuscula)
		.map(Utilitarios.primeiraLetra)
		.map(Utilitarios.grito)
		.forEach(println); // Usando composição!

	}

}
