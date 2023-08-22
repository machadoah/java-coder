package e_collections.b_list;

import java.util.Objects;

public class Usuario {

	String nome;

	public Usuario(String string) {
		this.nome = string;
	}
	
	@Override
	public String toString() {
		return "Muito prazer, " + this.nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}

}
