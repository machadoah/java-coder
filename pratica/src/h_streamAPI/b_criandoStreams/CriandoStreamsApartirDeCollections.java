package h_streamAPI.b_criandoStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreamsApartirDeCollections {
	
	public static void main(String[] args) {
		Consumer<Object> print = System.out::print;
		Consumer<Object> println = System.out::println;
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin \n");
		outrasLangs.parallelStream().forEach(print); // Os dados não são processados na ordem!
		
//		Stream.generate(() -> "a").forEach(print);;  -> sem ordenação e infinita
		// Suplier é um forncedor!!
		// generate é uma execução infinita!!
		Stream.iterate(0, n -> n + 1).forEach(println); // -> inicia de 0 até n+1 
	}

}
