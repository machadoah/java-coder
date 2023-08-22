package d_array.a_array;

import java.util.Arrays;

public class Array2 {
	
	public static void main(String[] args) {
		
		double[] notasAluno = {6.9, 4.7, 10.0, 1.90};
		System.out.println(Arrays.toString(notasAluno));
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.printf("Nota %d = %.2f\n", i+1,  notasAluno[i]);
		}
		
	}

}
