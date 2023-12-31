package teste.basico.usuario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		String jpql = """
				SELECT u FROM Usuario u
				""";

		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5); // Traz o n�mero de linhas

		List<Usuario> usuarios = query.getResultList();

		for (Usuario usuario : usuarios) {
			System.out.printf("id: %d - E-mail: %s - Nome: %s", usuario.getId(), usuario.getEmail(), usuario.getNome());
			System.out.println();
		}

		/*
		 * Comando equivalente em uma unica linha:
		 * 
		 * List<Usuario> usuariosN = em.createQuery("SELECT u FROM Usuario u",
		 * Usuario.class).setMaxResults(5).getResultList();
		 */
		em.close();
		emf.close();

	}

}
