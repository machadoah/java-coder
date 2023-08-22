package d_array;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MediaNotas {

	public static void main(String[] args) {
		
		// Fornecendo o tamanho do Array
		String tamanho = JOptionPane.showInputDialog("Forneca a quantidade de notas: ");
		int tamanhoArray = Integer.parseInt(tamanho);
		
		double[] notas = new double[tamanhoArray];
		
		String notaS;
		double notaD = 0;
		double somatoria = 0;
		
		// Alimentando o Array
		for (int i = 0; i < notas.length; i++) {
			notaS = JOptionPane.showInputDialog("Digite a nota numero " + (i+1) + ": ");
			notaD = Double.parseDouble(notaS);
			notas[i] = notaD;
			
		}
		
		// Imprimindo o Array
		System.out.println(Arrays.toString(notas));
		
		// Fazendo a somatoria das notas
		for (double nota : notas) {
			somatoria += nota;
		}
		
		double media = somatoria / notas.length;
		
		System.out.println("A media das notas fornecidas equivale a: " + media + "!");

	}

}
