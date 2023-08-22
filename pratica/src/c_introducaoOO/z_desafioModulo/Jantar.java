package c_introducaoOO.z_desafioModulo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Antonio", 75.00);
		System.out.println(p.apresentar());
		
		Comida c1 = new Comida("Feijoada", 0.350);
		Comida c2 =  new Comida("Sorvete", 0.275);
		Comida c3 = new Comida("Torta de Frango", 0.375);
		
		p.comer(c1);
		System.out.println(p.apresentar());
		
		p.comer(c2);
		System.out.println(p.apresentar());
		
		p.comer(c3);
		System.out.println(p.apresentar());
		
		
		
	}

}
