package teste.basico.usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 13L);

		usuario.setNome("Matheus Azevedo");
		usuario.setEmail("matheusm@lanche.com");

		// em.merge(usuario);

		/*
		 * Mesmo com o em.merge() estar comentado, pelo fato de estar no contexto
		 * gerencial, qualquer mudança realizada no objeto, ele é sincronizado com o BD.
		 * 
		 * O estado gerencial é ocasionado pelo em.getTransaction()!
		 */

		System.out.println(usuario.getNome());

		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
