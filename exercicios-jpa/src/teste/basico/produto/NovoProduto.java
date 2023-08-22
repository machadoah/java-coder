package teste.basico.produto;

import infraestrutura.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		
		Produto p = new Produto("Monitor 23'",1767.92);
		
		DAO<Produto> dao = new DAO<>(Produto.class);

		dao.incluirAtomico(p);
		
		System.out.println("Id do produto: " + p.getId());
	}

}
