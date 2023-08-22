package f_oo.a_composicao.z_desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String cpf;
	String nome;
	double debito;
	List<Compra> compras = new ArrayList<>(); // Composição unidirecional com Compra!

	public Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		compras.add(compra);
	}

	// Metodo que retorna a quantidade gasta em todas as compras
	double gastoCliente() {
		for (Compra compra : compras) {
			this.debito += compra.obterValorTotalCompra();
		}
		return this.debito;
	}
}
