package g_lambdas.d_consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import g_lambdas.c_predicate.Produto;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> print = produto -> System.out.println(produto.nome); 
		
		Produto p = new Produto("Lousa Branca", 49.89, 0.08);
		print.accept(p); // recebe o Produto e retorna "void", ou seja, nesse caso imprime!
		
		Produto p1 = new Produto("Lousa Branca", 49.89, 0.08);
		Produto p2 = new Produto("Caneta", 35.8, 0.18);
		Produto p3 = new Produto("Folha quadriculada", 70.75, 0.00);
		Produto p4 = new Produto("Tablet", 6080.90, 0.01);
		Produto p5 = new Produto("Regua de Quimica Organica", 49.99, 0.15);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5); 
		produtos.forEach(print);
		produtos.forEach(j -> System.out.println(j.preco));
	}

}
