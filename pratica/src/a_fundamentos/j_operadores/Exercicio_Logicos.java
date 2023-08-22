package a_fundamentos.j_operadores;

public class Exercicio_Logicos {
	
	public static void main(String[] args) {
		
		/*
		 * Trabalho na terça ( V ou F)
		 * Trabalho na quinta (V ou F)  
		 * 
		 * Se os dois derem certo -> uma tv de 50 e sorvete
		 * se um der certo -> uma tv de 32 e sorvete
		 * 
		 * se ambos derem errado -> não compra tv e não toma sorvete
		 * */
		
		boolean trabalhoT = false;
		boolean trabalhoQ = true;
		                    
		boolean comprouTv50 = trabalhoT && trabalhoQ;
		boolean comprouTv32 = trabalhoT ^ trabalhoQ;
		boolean tomouSorvete = comprouTv50 || comprouTv32;
		boolean ficouSaudavel = !tomouSorvete;
		
		System.out.println("Comprou Tv 50' : " + comprouTv50);
		System.out.println("Comprou Tv 32' : " + comprouTv32);
		System.out.println("Tomou sorvete: " + tomouSorvete);
		System.out.println("Ficou saudavel: " + ficouSaudavel);
		
		
		
	}

}
