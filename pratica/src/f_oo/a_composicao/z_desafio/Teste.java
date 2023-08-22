package f_oo.a_composicao.z_desafio;

public class Teste {

	public static void main(String[] args) {

		// Criar cliente
		Cliente c = new Cliente("Antonio");
		
		// Criar duas compras
		Compra c1 = new Compra();
		Compra c2 = new Compra();
		
		c.adicionarCompra(c1);
		c.adicionarCompra(c2);
		
		
		// Item
		
		c1.itens.add(new Item(2, (new Produto("Pizza de Calabresa",24.98))));
		c1.itens.add(new Item(3, (new Produto("Pizza de Mussarela",27.91))));
		
		c2.itens.add(new Item(2, (new Produto("Refrigerante 2litros",8.19))));
		c2.itens.add(new Item(15, (new Produto("Esfihas de chocolate",2.09))));
						
		//System.out.println(c.compras);
		
		// Imprimir valor total
		System.out.println(c.gastoCliente());
	}

}
