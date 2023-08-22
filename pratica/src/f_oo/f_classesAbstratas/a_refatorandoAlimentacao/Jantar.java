package f_oo.f_classesAbstratas.a_refatorandoAlimentacao;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Comida ingrediente1 = new Arroz(0.200);
		Comida ingrediente2 = new Feijao(0.100);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.400);
		
		convidado.comer(sobremesa);
		
		System.out.printf("%.2f", convidado.getPeso());
		
	}

}
