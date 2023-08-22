package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Considera a classe usu�rio como uma entidade no bd
public class Usuario {

	/*
	 * No BD cada atributo ser� mapeado para uma coluna de BD.
	 * 
	 * @Transient declara um atributo que n�o ser� mapeado para o banco de dados!
	 */

	@Id // Chave prim�ria!
	private Long id;
	private String nome;
	private String email;

	public Usuario() {

	}

	public Usuario(String nome, String email) {
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
