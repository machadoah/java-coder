package g_lambdas.h_binaryOperatorAndBiFunction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import javax.swing.JOptionPane;

public class OperadorBinario {

	public static void main(String[] args) {
		
		String number1 = JOptionPane.showInputDialog("Insira a primeira nota: ");
		String number2 = JOptionPane.showInputDialog("Insira a segunda nota: ");
		
		Double num1 = Double.parseDouble(number1);
		Double num2 = Double.parseDouble(number2);

		BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) / 2;
		System.out.printf("%.2f\n",media.apply(num1, num2));

		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = media.apply(n1, n2);
			
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(resultado.apply(num1, num2));
		
		Function<Double, String> conceito = m -> m>=7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(num1, num2));
		
	}

}
