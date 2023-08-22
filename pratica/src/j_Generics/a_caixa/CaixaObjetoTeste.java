package j_Generics.a_caixa;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double -> Double
		
		Double coisaA = (Double) caixaA.abrir();  
		// cast explito, pois o retorno é Object
		
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Ola");
		
		String coisaB= (String) caixaB.abrir();  
		// Toda hora é necessário converter Object -> mais especifico!
		
		System.out.println(coisaB);
	}

}
