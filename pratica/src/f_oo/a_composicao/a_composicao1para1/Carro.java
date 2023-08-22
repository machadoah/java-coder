package f_oo.a_composicao.a_composicao1para1;

public class Carro {

	final Motor motor;
	Porta p1;
	Porta p2;
	
	public Carro() {
		this.motor = new Motor(this); // Passando o proprio carro como parametro!
		this.p1 = new Porta(this);
		this.p2 = new Porta(this);
	}

	void acelerar() {
		if(motor.ligado == true) {
			if(motor.fatorInjecao < 2.6) {
				motor.fatorInjecao += 0.4;
			}
			
		}
	}

	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}

	void ligar() {
		if((p1.fechada || p1.fechada) == false ) {
			motor.ligado = false;
		} else {
			motor.ligado = true;
		}
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}

}
