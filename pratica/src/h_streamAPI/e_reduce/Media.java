package h_streamAPI.e_reduce;

public class Media {

	private double total;
	private int quantidade;

	Media adicionar(double valor) {
		total += valor;
		quantidade++;
		return this;
	}

	double getValor() {
		return total / quantidade;
	}
	
	static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		
		return resultante;
	}

}
