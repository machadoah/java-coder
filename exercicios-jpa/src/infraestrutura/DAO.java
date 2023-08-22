package infraestrutura;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<Entidade> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<Entidade> classe;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");

		} catch (Exception e) {
			// ... logar -> log4j
		}
	}

	public DAO() {
		this(null);
	}

	public DAO(Class<Entidade> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}

	public DAO<Entidade> teste() {
		return this;
	}

	public DAO<Entidade> abrirT() {
		em.getTransaction().begin();
		return this;
	}

	public DAO<Entidade> fecharT() {
		em.getTransaction().commit();
		return this;
	}

	public DAO<Entidade> incluir(Entidade e) {
		em.persist(e);
		return this;
	}

	public DAO<Entidade> incluirAtomico(Entidade e) {
		return this.abrirT().incluir(e).fecharT();
	}
	
	public List<Entidade> obterTodos(int quantidadeRegistros, int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		
		String jpql = "SELECT e FROM " + classe.getName() + " e";
		
		TypedQuery<Entidade> query = em.createQuery(jpql, classe);
		query.setMaxResults(quantidadeRegistros).setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public List<Entidade> obterTodos(){
		return this.obterTodos(10, 0);
	}
	
	public void fechar() {
		em.close();
	}

}
