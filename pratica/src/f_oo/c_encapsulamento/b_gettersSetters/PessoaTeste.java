package f_oo.c_encapsulamento.b_gettersSetters;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Pedro","Amoedo", -30);
		p1.setIdade(267);
//		p1.idade = -30; // alterar o valor
		
		System.out.println(p1.getIdade()); // ler o valor
		System.out.println(p1);
		
		System.out.println(p1.getNomeCompleto());
	}

}
