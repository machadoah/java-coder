package f_oo.e_interface;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		// Fazendo uso do construtor da superclass
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	public int getDelta() {
		if (ligarTurbo == true && ligarAr == false) {
			return 35;
		} else if (ligarTurbo == true && ligarAr == true) {
			return 30;
		} else if (ligarTurbo == false && ligarAr == false) {
			return 20;
		} else {
			return 15;
		}
	}

}
