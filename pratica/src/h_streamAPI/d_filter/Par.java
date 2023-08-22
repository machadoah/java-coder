package h_streamAPI.d_filter;

import java.util.Arrays;
import java.util.List;

public class Par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(3, 2, 4, 7, 5, 6, 7, 8, 9);

		
		nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);;

	}

}
