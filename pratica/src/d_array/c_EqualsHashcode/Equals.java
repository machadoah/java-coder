package d_array.c_EqualsHashcode;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedrosilva@microsoft.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedrosilva@microsoft.com";
		
		System.out.println("Comparando com '==': " + (u1 == u2)); // Compara os endereços de memória!
		System.out.println("Comparando com 'equals(u2)': " + (u1.equals(u2)));
		System.out.println("Comparando com 'equals(u1)': " + (u2.equals(u1)));
		
//		System.out.println("Usuario eh igual Date? " + u2.equals(new Date()));
		
		
	}

}
