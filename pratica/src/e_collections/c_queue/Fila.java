package e_collections.c_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Adiciona elementos na fila
		
		fila.add("Ana"); // ADD -> Retorna false quando a fila estiver cheia
		fila.offer("Bia"); // OFFER -> Lança uma exception quando a fila estiver cheia
		fila.add("Carlos"); 
		fila.offer("Daniel"); 
		fila.add("Rafaela"); 
		fila.offer("Gui"); 
		
		// Obtem os elementos da fila
		
		System.out.println(fila.peek()); // PEEK -> Retorna o 1º elemento da fila, se estiver vazia retorna null
		System.out.println(fila.element()); // ELEMENT -> Quando a fila estiver vazia, retorna uma exception!
		
//		fila.clear();
//		fila.size();
		
		// Contains
		
		System.out.println("Gui esta na fila? " + fila.contains("Gui"));
		
		
		// Removendo
		
		System.out.println("\nIniciando a remocao de elementos!");
		
		System.out.println(fila.poll()); // Retorna o 1º elemento da lista, já removendo-o
		System.out.println(fila.remove()); // Retorna o 1º elemento da lista, já removendo-o
		System.out.println(fila.poll()); // Retorna o 1º elemento da lista, já removendo-o
		System.out.println(fila.poll()); // Retorna o 1º elemento da lista, já removendo-o
		System.out.println(fila.poll()); // Retorna o 1º elemento da lista, já removendo-o
		System.out.println(fila.poll()); // Retorna o 1º elemento da lista, já removendo-o
		
		// poll retorna null quando não existe mais elemento
		// remove retorna uma exception
		
		System.out.println("A fila esta vazia? " + fila.isEmpty()); // isEmpty() -> Saber se ela esta vazia
		
		
	}

}
