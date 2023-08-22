package h_streamAPI.c_Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		/*
		 * 1. Número para string binária (e.g 6 para "110")
		 * 
		 * 2. Inverter a string (e.g "110" para "011")
		 * 
		 * 3. Converter novamente para inteiro (e.g "011" para 3)
		 */
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
		
		nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioParaInt).forEach(print);
		
	}

}
