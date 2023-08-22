package h_streamAPI.c_Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Mapa {
	
	public static void main(String[] args) {
		
		Consumer<Object> println = System.out::println;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		// cria um outra Lista com as marcas UpperCase
		marcas.stream().map(m -> m.toUpperCase()).forEach(println);; 	
	
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> grito = n -> n + "!!!";
		
		System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("jorginho"));
		
		System.out.println("\nUsando composicao!");
		
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(println); // Usando composição!
	}
}
