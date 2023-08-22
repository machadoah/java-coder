package e_collections.f_hashcode;

import java.util.HashSet;

import e_collections.b_list.Usuario;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>(); 
		// Pesquisar dentro de um Hash é mais rapido!
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		boolean result = usuarios.contains(new Usuario("Guilherme"));
		System.out.println("Guilherme esta em usuarios? " + result);
		
	}

}
