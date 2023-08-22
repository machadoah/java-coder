package f_oo.c_encapsulamento.a_casa.casaB;

import f_oo.c_encapsulamento.a_casa.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();

	void testeAcessos() {

//		System.out.println(sogra.segredo); // segredo que é private é o unico sem acesso!
//		System.out.println(sogra.facoDentroDeCasa);
//		System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}
	
	

}
