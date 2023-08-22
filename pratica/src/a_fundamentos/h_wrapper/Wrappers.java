package a_fundamentos.h_wrapper;

public class Wrappers {
	// Wrappers -> são a versão objeto dos tipos primitivos

	public static void main(String[] args) {

		// Numeros inteiros

		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 1_00_000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l);

		// Numeros flutuantes

		Float f = 123.44F;
		System.out.println(f);

		Double d = 1234.3243;
		System.out.println(d);

		// Booleano

		Boolean bool = Boolean.parseBoolean("true"); // convertendo string -> Boolean
		System.out.println(bool);

		System.out.println(bool && false);

		// Caracter

		Character c = '#';
		System.out.println(c.toString().equals("#"));

	}

}
