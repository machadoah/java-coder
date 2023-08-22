package h_streamAPI.b_criandoStreams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		// 1) usando stream.of
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS \n");
		langs.forEach(print);
		
		// 2) usando um array
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go \n"};
		
		// 2.1) stream.of
		Stream.of(maisLangs).forEach(print);
		
		// 2.2) Arrays.stream
		Arrays.stream(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		
	}
	


}
