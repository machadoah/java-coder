package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Por padrão todo atributo da classe será uma coluna na tabela.

// Referência que Usuário será uma Entidade, ou seja, uma tabela.
@Entity
public class Usuario {

	// Referência o atributo ID como PK
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)// Auto-incremento de id
	private Long id;

	private String nome;

	private String email;

	public Usuario() {

	}

	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
