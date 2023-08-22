package f_oo.e_interface;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro = new Civic();
		
		carro.acelerar(); 
		carro.acelerar(); 
		carro.frear(); 
		
		System.out.println("Velocidade do civic eh " + carro.velocidade + "km/h");
		
		Ferrari ferrari = new Ferrari(400); 
		// Polimorfismo dinâmico 
		
		ferrari.acelerar();
		ferrari.acelerar(); 
		
		ferrari.ligarTurbo();
		
		ferrari.frear(); 
		ferrari.acelerar();
		
		System.out.println("Velocidade da Ferrari eh " + ferrari.velocidade + "km/h");
		

	}

}
