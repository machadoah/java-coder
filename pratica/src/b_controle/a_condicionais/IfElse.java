package b_controle.a_condicionais;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o numero: ");
		
		int num = Integer.parseInt(valor);
		
		if(num % 2 == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("Numero impar");
		}
	}

}
