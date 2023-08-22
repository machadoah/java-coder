package i_TratamentoErros.e_finally;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {

			System.out.println(7 / entrada.nextInt());

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally { // Sempre é chamado
			System.out.println("Finalmente");
			entrada.close();
		}

	}

}
