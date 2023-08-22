package i_TratamentoErros.c_personalizadaNaoChecada;

@SuppressWarnings("serial") 
public class NumeroForaIntervaloException extends RuntimeException{
	
	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return String.format("O atributo '%s' esta fora do range", nomeDoAtributo);
	}
}
