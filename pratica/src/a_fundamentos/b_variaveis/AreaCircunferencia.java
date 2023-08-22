package a_fundamentos.b_variaveis;

public class AreaCircunferencia {

	public static void main(String[] args) {

		// [Tipo] [Identificador] = [Valor]
		double raio = 3.4;

		// Por convenção constantes possuem seus identificadores em letras maiusculas
		final double PI = 3.14159; // 'final' representa que é uma constante

		double area = raio * raio * PI;

		System.out.println("Quanto o raio vale " + raio + ", a area vale: " + area + "m�.");

		raio = 10;
		area = raio * raio * PI;

		System.out.println("Quanto o raio vale " + raio + ", a area vale: " + area + "m�.");

	}

}
