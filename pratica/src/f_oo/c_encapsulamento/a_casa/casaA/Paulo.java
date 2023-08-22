package f_oo.c_encapsulamento.a_casa.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {
		
//		System.out.println(esposa.segredo); // segredo que é private é o unico sem acesso!
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}

}
