package f_oo.b_heranca.z_ClassesTeste;

import f_oo.b_heranca.z_Desafio2.Carro;
import f_oo.b_heranca.z_Desafio2.Civic;
import f_oo.b_heranca.z_Desafio2.Ferrari;

public class Teste {

	public static void main(String[] args) {
		
		Civic carro = new Civic();
		
		carro.acelerar(); // 5
		carro.acelerar(); // 10
		carro.frear(); // 5
		
		System.out.println("Velocidade do civic eh " + carro.velocidade + "km/h");
		
		Carro ferrari = new Ferrari(400); 
		// Polimorfismo dinâmico 
		
		ferrari.acelerar(); // 15
		ferrari.acelerar(); // 30
		ferrari.frear(); // 25
		ferrari.acelerar(); // 30
		
		System.out.println("Velocidade da Ferrari eh " + ferrari.velocidade + "km/h");
		

	}

}
