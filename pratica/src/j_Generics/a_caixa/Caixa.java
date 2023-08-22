package j_Generics.a_caixa;

public class Caixa<T> { // Estrutura do generics
	
private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return this.coisa;
	}
}
