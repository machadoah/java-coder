package h_streamAPI.c_Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class DesafioMap2 {

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
		
		
		List<String> binarios = nums.stream().map(n -> Integer.toBinaryString(n)).collect(Collectors.toList());
		
		binarios.forEach(print);
		System.out.println();
		
		List<StringBuilder> reverso = binarios.stream().map(n -> new StringBuilder(n).reverse()).collect(Collectors.toList());
		
		reverso.forEach(print);
		System.out.println();
		
		List<Integer> inteiro = reverso.stream().map(n -> Integer.parseInt(n.toString(), 2)).collect(Collectors.toList());
		
		inteiro.forEach(print);
	}

}
