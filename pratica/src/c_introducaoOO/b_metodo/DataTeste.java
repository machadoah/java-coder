package c_introducaoOO.b_metodo;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		d1.dia = 27;
		d1.mes = 05;
		d1.ano = 2004;
		
		System.out.println(d1.obterData());
		
//		System.out.printf("%d / %d / %d", d1.dia, d1.mes, d1.ano);
		
		Data d2 = new Data();
		d2.dia = 18;
		d2.mes = 12;
		d2.ano = 1979;
		
		System.out.println(d2.obterData());
		
//		System.out.printf("\n%d / %d / %d", d2.dia, d2.mes, d2.ano);
		
		Data d3 = new Data();
		System.out.println(d3.obterData());
		
	}

}
