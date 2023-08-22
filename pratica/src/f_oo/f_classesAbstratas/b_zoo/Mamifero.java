package f_oo.f_classesAbstratas.b_zoo;

public abstract class Mamifero extends Animal{

	@Override
	public final String mover() { 
		// final define que ele não pode ser sobrescrito!
		return "Usando as patas";
	}
	
	public abstract String mamar();

}
