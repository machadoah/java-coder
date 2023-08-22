package h_streamAPI.e_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	// Somatória dos valores!

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> soma = (ac, n) -> ac + n;

		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);

		Integer total2 = nums.parallelStream().reduce(100, soma);
		// 101 + 102 + 103 + 104 + 105 + 106 + 107 + 108 + 109
		System.out.println(total2);

		Integer total3 = nums.stream().reduce(100, soma);
		// 101 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
		System.out.println(total3);

		// Resultado foi um Optional <Integer> ...
		nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);
		// 6 + 7 + 8 + 9

	}

}
