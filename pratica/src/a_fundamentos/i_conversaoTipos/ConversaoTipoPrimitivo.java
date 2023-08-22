package a_fundamentos.i_conversaoTipos;

public class ConversaoTipoPrimitivo {
	
	public static void main(String[] args) {
		
		double numeroA = 1; // AQUI o Java faz a convers�o int -> double (IMPLICITAMENTE)
		System.out.println(numeroA);
		
		// Casting
		float numeroB = (float) 1.1245678888; // AQUI double -> float (EXPLICITAMENTE)
		System.out.println(numeroB);
		
		int numeroC = -129;
		byte numeroD = (byte) numeroC;
		System.out.println(numeroD);
		
		double numeroE = 1.99999999999999;
		int numeroF = (int) numeroE;
		System.out.println(numeroF); // Trunca os valores após a virgula!
		
		
		
		
	}

}
