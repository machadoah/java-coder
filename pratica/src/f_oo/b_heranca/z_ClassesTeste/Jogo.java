package f_oo.b_heranca.z_ClassesTeste;

import f_oo.b_heranca.a_jogo.Direcao;
import f_oo.b_heranca.a_jogo.Heroi;
import f_oo.b_heranca.a_jogo.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		Heroi heroi = new Heroi(8, 45);

		monstro.x = 10;
		monstro.y = 10;

		heroi.x = 11;
		heroi.y = 8;

		System.out.println(monstro.obterPosicao());
		System.out.println(heroi.obterPosicao());

		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.LESTE);

		System.out.println(monstro.obterPosicao());
		System.out.println(heroi.obterPosicao());

		monstro.atacar(heroi);

		heroi.atacar(monstro);
		heroi.atacar(monstro);

		System.out.println("Vida de monstro: " + monstro.obterVida());
		System.out.println("Vida de heroi: " + heroi.obterVida());
	}

}
