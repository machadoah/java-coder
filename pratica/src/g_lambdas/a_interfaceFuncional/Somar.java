package g_lambdas.a_interfaceFuncional;

public class Somar implements Calculo{

	@Override
	public double executar(double a, double b) {
		return a + b;
	}

}
