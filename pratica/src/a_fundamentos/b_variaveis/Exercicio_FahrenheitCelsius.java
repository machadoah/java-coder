package a_fundamentos.b_variaveis;

import java.util.Scanner;

public class Exercicio_FahrenheitCelsius {
	
	// (ºF - 32) x (5/9) = ºC
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double RAZAO = 5.0/9.0;
		final int AJUSTE = 32;
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double TemperaturaFahrenheit = sc.nextDouble();
		
		double TemperaturaCelsius = (RAZAO) * (TemperaturaFahrenheit - AJUSTE);
		
		System.out.println("\nA temperatura de " + TemperaturaFahrenheit + "F representa " + TemperaturaCelsius + "C.");
		sc.close();
		
	}

}
