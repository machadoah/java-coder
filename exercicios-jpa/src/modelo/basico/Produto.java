package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos", schema = "curso_java") // O nome que será usado no bd
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Define as caracteristicas responsáveis para a coluna, na criação dela pelo JPA
	@Column(name = "prod_nome", length = 200, nullable = false) 
	private String nome;

	// precision é a quantidade de algarimos, scale é a quantidade de algarismos após a virgula
	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	private Double preco;

	public Produto() {

	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
