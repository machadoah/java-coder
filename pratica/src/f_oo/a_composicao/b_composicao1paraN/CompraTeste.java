package f_oo.a_composicao.b_composicao1paraN;

public class CompraTeste {

	public static void main(String[] args) {

		Compra c1 = new Compra();
		c1.cliente = "Antonio Henrique";
		c1.adicionarItem(new Item("Caneta", 20, 7.45));
		c1.itens.add(new Item("Borracha", 12, 3.89));
		c1.itens.add(new Item("Caderno", 3, 18.79));
		c1.adicionarItem(new Item("Lapiseira", 12, 7.79));
		
		System.out.println(c1.obterItens());
		System.out.printf("%.2f",c1.obterValorTotal());
		
	}

}
