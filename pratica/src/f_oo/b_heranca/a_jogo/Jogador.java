package f_oo.b_heranca.a_jogo;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;
	
	public Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(this.x - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);

		if ((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0)) {

			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}

	}

	public String obterPosicao() {
		String posicao = "(" + this.x + ", " + this.y + ")";
		return posicao;
	}
	
	public int obterVida() {
		return this.vida;
	}

	public boolean andar(Direcao direcao) {

		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;

	}
}
