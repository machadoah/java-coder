package i_TratamentoErros.c_personalizadaNaoChecada;

public class ValidarTeste {

	public static void main(String[] args) {

		// Aluno aluno;

		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			e.getMessage();

		} catch (IllegalArgumentException | NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim");

	}

}
