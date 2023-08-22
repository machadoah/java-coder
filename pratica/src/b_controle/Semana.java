package b_controle;

import javax.swing.JOptionPane;

public class Semana {

	public static void main(String[] args) {

		String dia = JOptionPane.showInputDialog("Insira o dia da semana: ");

		String day = dia.trim().toLowerCase();

		if (day.equals("domingo")) {
			System.out.println(1);
			
		} else if (day.equals("segunda")) {
			System.out.println(2);
			
		} else if (day.equals("terça")) {
			System.out.println(3);
			
		} else if (day.equals("quarta")) {
			System.out.println(4);
			
		} else if (day.equals("quinta")) {
			System.out.println(5);
			
		} else if (day.equals("sexta")) {
			System.out.println(6);
			
		} else if (day.equals("sabádo")) {
			System.out.println(7);
		}

	}

}
