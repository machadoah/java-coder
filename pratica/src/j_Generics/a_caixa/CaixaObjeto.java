package j_Generics.a_caixa;

public class CaixaObjeto {
	
	private Object coisa;
	
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return this.coisa;
	}
}
