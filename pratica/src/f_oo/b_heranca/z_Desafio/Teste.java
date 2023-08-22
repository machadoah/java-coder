package f_oo.b_heranca.z_Desafio;

public class Teste {

	public static void main(String[] args) {
		
		Civic carro = new Civic();
		
		carro.acelerar(); // 5
		carro.acelerar(); // 10
		carro.frear(); // 5
		
		System.out.println("Velocidade do civic eh " + carro.velocidade + "km/h");
		
		Carro ferrari = new Ferrari(); 
		// Polimorfismo dinâmico 
		
		ferrari.acelerar(); // 15
		ferrari.acelerar(); // 30
		ferrari.frear(); // 25
		
		System.out.println("Velocidade da Ferrari eh " + ferrari.velocidade + "km/h");
		

	}

}
