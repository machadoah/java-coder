package f_oo.a_composicao.z_desafioResolucao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto produto, int quantidade) {
		// Usando o contrutor de Produto!
		this.itens.add(new Item(produto, quantidade)); 
	}
	
	void adicionarItem(String produto,double preco, int quantidade) {
		this.itens.add(new Item(new Produto(produto, preco), quantidade)); 
	}
	
	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += (item.quantidade * item.produto.preco);
		}
		return total;
	}

}
