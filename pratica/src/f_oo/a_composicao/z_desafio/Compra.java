package f_oo.a_composicao.z_desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	double valor;
	Cliente cliente;
	List<Item> itens = new ArrayList<>(); // Composição unidirecional com Item!
	

	// obterValorTotal
	double obterValorTotalCompra() {
		for (Item item : itens) {
			this.valor += item.obtemValorItens();
		}
		return valor;
	}

}
