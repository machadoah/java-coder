package i_TratamentoErros.f_excecaoCausadora;

import i_TratamentoErros.d_personalizadaChecada.Aluno;

public class Causa {
	// Nem sempre a bomba que estoura é a quele iniciou o problema!

	public static void main(String[] args) {

		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if (e.getCause() != null)
				System.out.println(e.getCause().getMessage());
		}
		
		metodoA(null);
	}

	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}

	static void metodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("Aluno esta nulo!");
		}

		System.out.println(aluno.nome);
	}

}
