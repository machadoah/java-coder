package e_collections.b_list;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		// Adicionando na lista
		lista.add(u1);
		
		// Adicionando na lista
		lista.add(new Usuario("Antonio"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu")); // Aceita itens repetidos!!
		
		System.out.println("Nome: " + lista.get(3).nome); // Devolve do indice 3, o nome!
		
		// Removendo da lista
		lista.remove(1); // Remove o Antonio!
		lista.remove(new Usuario("Manu")); // Remove a Bia!
		
		// Contem
		System.out.println("Esta na lista? >> " + lista.contains(new Usuario("Lia"))); // Verifica se Lia esta na lista
		
		for (Usuario usuario : lista) {
			System.out.println("Ainda estou na lista >>>" + usuario.nome);
		}
		
		System.out.println(u1); // Utiliza a toString
	}

}
