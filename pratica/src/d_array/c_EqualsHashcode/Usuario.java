package d_array.c_EqualsHashcode;

public class Usuario {
	
	String nome;
	String email;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario) {
			
			Usuario outro = (Usuario)obj;
			// Se nome e email forem igual, os objetos são igual, remodelando o metodo equals
			boolean nomeIgual = outro.nome == this.nome;
			boolean emailIgual = outro.email == this.email;
			
			if((nomeIgual && emailIgual) == true) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}

}
