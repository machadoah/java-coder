package teste.basico.usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 13L);

		usuario.setNome("Matheus A");
		usuario.setEmail("mrzz@lanche.com");

		// Remove o contexto gerencial!
		em.detach(usuario);

		/*
		 * Gera somente o SELECT!
		 * 
		 * Por causa do detach!
		 * 
		 * Se descomentar o em.merge() a modificação será executada.
		 */

		// em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
