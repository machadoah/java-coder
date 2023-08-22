package f_oo.a_composicao.z_desafio;

public class Item {
	
	int quantidade;
	Produto produto; // Composição unidirecional com produto!
	
	public Item(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	double obtemValorItens() {
		return quantidade * produto.obtemValorProduto();
	}

}
