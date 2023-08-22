package i_TratamentoErros.d_personalizadaChecada;

@SuppressWarnings("serial") 
public class StringVaziaException extends Exception{
	
	private String nomeDoAtributo;

	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return String.format("O atributo '%s' esta vazio", nomeDoAtributo);
	}
}
