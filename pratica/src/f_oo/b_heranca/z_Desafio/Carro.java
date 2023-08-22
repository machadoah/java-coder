package f_oo.b_heranca.z_Desafio;

public class Carro {
	
	double velocidade;
	
	public void acelerar() {
		velocidade += 5;
	}
	
	public void frear() {
		if(velocidade >= 5) {
			velocidade -= 5;
		} else {
			this.velocidade = 0;
		}
	}

}
