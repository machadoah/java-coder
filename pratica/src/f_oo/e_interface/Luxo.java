package f_oo.e_interface;

public interface Luxo {
	
	void ligarAr();
	void desligarAr();
	
	// Métodos padrões
	// Não possui obrigatoriedade de implementação, pois ela é padrão aqui
	
	default int nivelDoAr() {
		return 1;
	}
}
