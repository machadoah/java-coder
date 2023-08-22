package f_oo.b_heranca.a_jogo;

public class Heroi extends Jogador {
	// Heroi reusa os códigos de Jogador!
	
	public Heroi(int x, int y) {
		super(x, y);
	}

	public boolean atacar(Jogador oponente) {
		// Heroi ataca 2x mais que o normal!
		boolean atack1 = super.atacar(oponente);
		boolean atack2 = super.atacar(oponente);
		
		return atack1 || atack2;
	}
	
	

}
