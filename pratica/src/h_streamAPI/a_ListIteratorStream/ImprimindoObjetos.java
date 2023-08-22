package h_streamAPI.a_ListIteratorStream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		// For tradicional
		System.out.println("\nUsando For tradicional");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		// Foreach
		System.out.println("\nUsando Foreach");
		for (String aluno : aprovados) {
			System.out.println(aluno);
		}
		
		// Usando Iterator
		System.out.println("\nUsando Iterator");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Usando Stream
		System.out.println("\nUsando Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno
	}

}
