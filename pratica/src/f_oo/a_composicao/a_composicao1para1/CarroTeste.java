package f_oo.a_composicao.a_composicao1para1;

public class CarroTeste {

	public static void main(String[] args) {

		Carro carro = new Carro();
		System.out.println(carro.estaLigado());

		carro.ligar();
		System.out.println(carro.estaLigado());

		System.out.println(carro.motor.giros());

		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();

		System.out.println(carro.motor.giros());

		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();

		System.out.println(carro.motor.giros());

		// Encapsulamento
//		carro.motor.fatorInjecao = -300;

	}

}
