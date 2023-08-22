package f_oo.a_composicao.b_composicao1paraN;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	int obterItens() {
		return this.itens.size();
	}
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}

	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	double obterValorTotal() {
		double valor = 0;
		
		for (Item item : itens) {
			valor += (item.preco * item.quantidade);
		}
		return valor;
	}

	
	
	
}
