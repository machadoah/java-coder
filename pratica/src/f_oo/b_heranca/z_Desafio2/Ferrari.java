package f_oo.b_heranca.z_Desafio2;

public class Ferrari extends Carro{
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima) {
		// Fazendo uso do construtor da superclass
		super(velocidadeMaxima); 
		delta = 350;
	}

//	@Override
//	public void acelerar() {
//		this.velocidade += 350;
//		
//	}

}
