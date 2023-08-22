package e_collections.a_set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" }) // Remove alertas de erro!
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		
		// Adicionando elementos
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); 
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		// Acessando quantidade de elementos
		System.out.println("tamanho de conjunto eh: " + conjunto.size()); // tamanho
		
		// Removendo elementos do conjunto
		System.out.println("Consigo remover o elemento " + 'x' +" ? " + (conjunto.remove('x')));
		System.out.println("Consigo remover o elemento " + "teste" +" ? " + (conjunto.remove("teste")));
		
		System.out.println("tamanho de conjunto eh: " + conjunto.size()); // tamanho

		// Vericar se existe determinado elementos
		System.out.println("Teste esta presente em conjunto? " + conjunto.contains("Teste"));
		System.out.println("x esta presente em conjunto? " + conjunto.contains('x'));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println("nums possui os elmentos: " + nums);
		System.out.println("conjunto possui os elementos: " + conjunto);
		
		// Uniao de conjuntos
//		conjunto.addAll(nums); // Adicionando os elementos de nums em conjunto
		System.out.println("A uniao de conjunto e nums, resulta em: " + conjunto);
		
		// Intersecção de conjuntos
		conjunto.retainAll(nums); // Tornando conjunto a intersecao dele com nums
		System.out.println("A intersecao de conjunto e nums, resulta em: " + conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	
	}

}
