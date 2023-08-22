package f_oo.a_composicao.z_desafioResolucao;

public class Teste {

	public static void main(String[] args) {

		Cliente c = new Cliente("Leonardo Leitao");

		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem((new Produto("Notebook", 5800)), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem((new Produto("Impressora", 890.90)), 1);

		c.adicionarCompra(compra1);
		c.adicionarCompra(compra2);
		
//		c.compra.add(compra1);
//		c.compra.add(compra2);

		System.out.println("O valor gasto nas compras foi de: " + c.obterValorTotal());
	}

}
