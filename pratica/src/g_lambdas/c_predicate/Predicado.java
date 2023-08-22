package g_lambdas.c_predicate;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
	
	Predicate<Produto> isCaro = produto -> (produto.preco * (1 - produto.desconto)>= 3000);
	// Predicado recebe um unico parametro e devolve true ou false
	
	Produto produto = new Produto("Notebook", 7000.90, 0.15);
	
	System.out.println(isCaro.test(produto));
	}
}
