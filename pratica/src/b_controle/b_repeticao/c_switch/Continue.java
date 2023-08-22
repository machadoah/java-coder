package b_controle.b_repeticao.c_switch;

public class Continue {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i % 2 == 1) {
				continue; // Interrompe apenas a iteração
			}
			
			System.out.println(i);
			
		}
		
	}

}
