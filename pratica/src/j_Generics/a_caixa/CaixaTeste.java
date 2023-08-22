package j_Generics.a_caixa;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Ola");

		System.out.println(caixaA.abrir());
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.1415926);
		
		System.out.println(caixaB.abrir());
	}

}
