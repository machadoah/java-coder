package i_TratamentoErros.d_personalizadaChecada;

public class Validar {
	
	private Validar() {
		
	}
	
	// SOU OBRIGATORIAMENTE A DE FORMA EXPLICITA LANÇAR COM 'THROWS'
	public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaIntervaloException{
		
		if(aluno == null) {
			throw new IllegalArgumentException("Aluno esta nulo");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota <0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}

}
