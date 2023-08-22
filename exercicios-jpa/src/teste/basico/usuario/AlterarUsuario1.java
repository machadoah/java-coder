package teste.basico.usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// Indica qual usuário será alterado
		Usuario usuario = em.find(Usuario.class, 13L);

		// Novos dados
		usuario.setNome("Matheus M");
		usuario.setEmail("matheusm@lanche.com");

		// atualiza os dados no BD
		em.merge(usuario);

		System.out.println(usuario.getNome());

		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
