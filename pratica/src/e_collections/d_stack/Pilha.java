package e_collections.d_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O pequeno principe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");

		// O Hobbit <- 3º
		// Dom Quixote <- 2º
		// O pequeno principe <- 1º

		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		// Os livros saem do ultimo adicionado para o primeiro!
		for (String string : livros) {
			System.out.println(string);
		}

		System.out.println(livros.poll()); // Retorna lulo quase não tenha nada a ser removido
		System.out.println(livros.pop()); // Lança uma exeption caso não tenha nada a ser removido
		System.out.println(livros.poll());

		/*
		 * ALGUNS METODOS QUE SÃO COMUNS A TODOS OS DEMAIS TAMBEM!
		 * ---------------------------------------------------------
		 *
		 * livros.size();
		 * 
		 * livros.clear();
		 * 
		 * livros.contains();
		 * 
		 * livros.isEmpty();
		 */

	}

}
