package e_collections.e_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();

		// Adicionar elementos -> Adiciona e substitui, caso já exista
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo"); // Alterou o nome da chave anterior!
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Roberto");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.get(1)); // Imprime o Value da Key = 1
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(2, "Rafaela"));
		
		System.out.println("O Map possui " + usuarios.size() + " elementos!");
		System.out.println(usuarios.keySet()); // Retorna um Array com as chaves!
		System.out.println(usuarios.entrySet()); // Retorna [K=V, K=V, ... , K=V]
		
		System.out.println("Possui chave igual a 5? " + usuarios.containsKey(5));
		System.out.println("Possui valor igual a 'Rebeca'? " + usuarios.containsValue("Rebeca"));
		
		// Percorrer os elementos
		
		// Percorrendo somente as chaves!
		System.out.println("Chaves: ");
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println();
		
		// Percorrendo somente os valores!
		System.out.println("Valores");
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		// Percorrendo chaves e valores!
		System.out.println("K,V : ");
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}

}
