package i_TratamentoErros.b.checadaVsNaoChecada;

public class LancandoErro {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim");
	}

	// Não checada ou não verificada, não fornece um erro de compilação! Eu posso
	// trata-lo ou não.
	static void geraErro1() {
		throw new RuntimeException("Erro #01"); // não basta criar, com 'throw' é necessário lança-la
	}

	// Exception checada, fornece um erro de compilação! O nesse caso devo colocar
	// no método que eu lanço ela!
	static void geraErro2() throws Exception {
		throw new Exception("Erro #02");
	}

}
