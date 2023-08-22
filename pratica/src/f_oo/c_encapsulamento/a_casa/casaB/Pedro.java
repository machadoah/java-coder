package f_oo.c_encapsulamento.a_casa.casaB;

import f_oo.c_encapsulamento.a_casa.casaA.Ana;

public class Pedro extends Ana {

	Ana mae = new Ana();

	void testeAcessos() {

//		System.out.println(segredo); // segredo que é private é o unico sem acesso!
//		System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);

	}

}
