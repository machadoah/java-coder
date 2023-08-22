package c_introducaoOO.b_metodo;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data (){
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	
	Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano; 
	}
	
	String obterData() {
		return (dia + "/" + mes + "/" + ano);
	}
}
