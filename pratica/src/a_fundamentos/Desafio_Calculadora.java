package a_fundamentos;

import javax.swing.JOptionPane;

public class Desafio_Calculadora {

	public static void main(String[] args) {

		// Ler num1
		// Ler num2
		// + - * / %

		String num1 = JOptionPane.showInputDialog("Insira o primeiro valor: ");
		String num2 = JOptionPane.showInputDialog("Insira o segundo valor: ");

		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);

		String op = JOptionPane.showInputDialog("Insira o operador: (+, -, *, /, %)");

		double resultado = "%".equals(op) ? n1 % n2 : 0;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "+".equals(op) ? n1 + n2 : resultado;

		System.out.printf("O resultado de %.2f %s %.2f equivale a %.2f.", n1, op, n2, resultado);

	}

}
