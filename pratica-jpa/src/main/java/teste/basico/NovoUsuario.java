package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {

		/*
		 * Entity manager � o gerenciador das classes que ser�o mapeadas para o banco de
		 * dados!
		 * 
		 * Responsavel por realizar o crud/intera��o com o banco de dados, convertendo
		 * os dados do bd em comando SQL
		 * 
		 * EntityManagerFactory � respons�vel por criar o EM!
		 */
		
		// criando fabrica de conex�o para pratica-jpa, onde esta as informa��es para acessar o bd
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratica-jpa");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Usuario newUser = new Usuario("Djalma","djalma@lanche.com.br");
		newUser.setId(001L);
		entityManager.persist(newUser);
		
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}















