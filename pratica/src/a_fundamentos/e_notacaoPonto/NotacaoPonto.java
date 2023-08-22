package a_fundamentos.e_notacaoPonto;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String saudacao = "Bom dia!";
		
		// Torna a string maiuscula
		System.out.println(saudacao.toUpperCase());
		
		// Torna a string minuscula
		System.out.println(saudacao.toLowerCase());
		
		// Substitui String
		System.out.println(saudacao.replace("!", " Senhora"));
		
		// Concatena outra string
		System.out.println(saudacao.concat(" Hoje tem aula de Java!"));
		
		// É possivel realizar n notações em uma unica condição
		System.out.println("Leo".toUpperCase().concat(" esta sendo o maior programador de Java."));
		
		//ATENÇÃO: TIPOS PRIMITIVOS NÃO POSSUEM NOTAÇÃO PONTO!!
	}

}
