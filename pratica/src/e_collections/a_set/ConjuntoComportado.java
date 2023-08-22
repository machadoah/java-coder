package e_collections.a_set;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
//		Set lista = new HashSet(); -> Permite qualquer tipo de objetos!
//		Set<String> listaAprovados = new HashSet<>(); // Permite somente strings
		
		// TreeSet obdece a ordem ALFABÉTICA!
		SortedSet<String> listaAprovados = new TreeSet<>(); 
		
		listaAprovados.add("Antonio");
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Pedro");
		listaAprovados.add("Lucas");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		
		
	}

}
