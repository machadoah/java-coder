package c_introducaoOO.c_membrosClasseVsInstancia;

import javax.swing.JOptionPane;

public class AreaCircTeste {

	public static void main(String[] args) {

		String raio = JOptionPane.showInputDialog("Inisira o valor do raio em cm: ");
		
		double raioDouble = Double.parseDouble(raio);
		
		
		AreaCirc a = new AreaCirc(raioDouble);
		
		System.out.printf("A area com raio igual a %.2fcm vale %.2fcm^2.",raioDouble, a.area());
		
	}

}
