package z_padroes.observer;

public class Namorada implements ObservadorChegadaAniversarinate{

	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados ...");
		System.out.println("Apagar as luzes ...");
		System.out.println("Esperar um pouco ...");
		System.out.println("Surpresa!!!");
	}


}
