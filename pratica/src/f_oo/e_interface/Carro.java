package f_oo.e_interface;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	public int velocidade;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		
		if(velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += getDelta();
		}
	}
	
	public void frear() {
		if(velocidade >= 5) {
			velocidade -= 5;
		} else {
			this.velocidade = 0;
		}
	}
	
	public int getDelta() {
		return delta;
	}
	
	public void setDelta(int delta) {
		this.delta = delta;
	}

}
