package a_fundamentos.d_tiposPrimitivos;

public class InformacoesFuncionario {

	public static void main(String[] args) {

		// Tipos númericos

		// # > Inteiros

		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulado = 3_134_845_223L;

		// # > Reais

		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo Booleano

		boolean estaDeFerias = false;

		// Tipo Caractere

		char status = 'A'; // Utiliza itens da tabela Unicode!

		// --------------------------------------------------------

		// Dias de Empresa
		System.out.println("O funcionario possui " + anosDeEmpresa * 365 + " dias de empresa.");

		// Numero de Viagens
		System.out.println("O funcionario realizou " + numeroDeVoos / 2 + " viagens.");

		// Pontos por real
		System.out.println("Para cada real vendido ele obteve " + pontosAcumulado / vendasAcumuladas + " pontos.");

		// ID e salario
		System.out.println("O funcioanrio " + id + " ganha -> R$" + salario);

		// Férias
		System.out.println("O funcionario esta de ferias: " + estaDeFerias);

		// Status
		System.out.println("O funcionario possui status de " + status);

	}

}
