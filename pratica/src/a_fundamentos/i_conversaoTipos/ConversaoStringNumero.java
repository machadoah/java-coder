package a_fundamentos.i_conversaoTipos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {

		String valor1 = JOptionPane.showInputDialog("Digite o primeiro nome: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo nome: ");

		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);

		double soma = num1 + num2;

		System.out.println("Soma vale " + soma);
		System.out.println("A media vale " + soma / 2);

	}

}
