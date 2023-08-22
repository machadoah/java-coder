package a_fundamentos.g_tipoString;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Ola pessoal!".charAt(0)); // Seleciono caracter especifico!

		String s = "Bom dia";

		// Concatena valores a String
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!");

		// Verifica se a String inicia com dado elemento
		System.out.println(s.toLowerCase().startsWith("bom"));

		// Tamanho da String
		String pedroII = "Pedro de Alcantara Joao Carlos Leopoldo Salvador Bibiano Francisco Xavier de Paula Leocadio Miguel Gabriel Rafael Gonzaga";
		System.out.println("O nome de Dom Pedro II tem " + pedroII.replace(" ", "").length() + " letras.");

		// Verificar se a String finaliza com dado elemento
		System.out.println(pedroII.toLowerCase().endsWith("gonzaga"));

		// Verifica igualdade!
		System.out.println(s.equalsIgnoreCase("BoM dIA")); // Ignore case não leva em enconta maiusculo ou minusculo!

	}

}
