package teste.umparaum;

import infraestrutura.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Rodrigo", assento);
		
		DAO<Object> dao = new DAO<>();

		dao.incluirAtomico(cliente);
	}

}
