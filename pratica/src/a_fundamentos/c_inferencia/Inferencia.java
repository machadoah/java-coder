package a_fundamentos.c_inferencia;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; // Nesse caso o Java infere o tipo, pelo valor atribuido a variável
		var multi = a * b;
		
		System.out.println("a x b = " + multi);

		double d; // Declarando uma variável
		d = 123.98; // Inicializando uma variável
		
		System.out.println(d); // Usando a variável
		
		// Usando o 'var' é necessário realizar a declação e a inicialização, na mesma sentença!
		
	}

}
