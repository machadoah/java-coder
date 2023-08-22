package teste.basico.usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {

		// EntityManager é o gerente das classes mapeadas para tabelas do Banco de Dados
		// Responsavel por alterar, excluir, consultar, criar entidadades

		// EntityManagerFactory é responsavel por criar o EntityManager.
		// Pois cada em fica responsavel uma dada conexão de um banco de dados.

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		Usuario novoUsuario = new Usuario("Teste", "remove@lanche.com");

		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		System.out.println("O Id gerado foi: " + novoUsuario.getId());
		
		em.close();
		emf.close();

	}

}
