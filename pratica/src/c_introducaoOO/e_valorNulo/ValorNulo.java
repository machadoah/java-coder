package c_introducaoOO.e_valorNulo;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		String s2 = null;
//		s2.length(); // Isso lançará NullPointerException
		
		System.out.println(s2);
		
	}

}
