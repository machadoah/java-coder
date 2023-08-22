package c_introducaoOO.c_membrosClasseVsInstancia;

public class AreaCirc {

	double raio;
	static final double PI = 3.14;
	// static torna a variável atributo da classe e não da instância

	AreaCirc(double raio) {
		this.raio = raio;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}

}
