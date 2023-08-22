package f_oo.b_heranca.z_Desafio2;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	public int velocidade;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		
		if(velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += delta;
		}
	}
	
	public void frear() {
		if(velocidade >= 5) {
			velocidade -= 5;
		} else {
			this.velocidade = 0;
		}
	}

}
