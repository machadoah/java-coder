package g_lambdas.a_interfaceFuncional;

@FunctionalInterface // Força ter um unico método abstrato!
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}

}
