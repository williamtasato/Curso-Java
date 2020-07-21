package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {
	
	private String nomeDoAtributo;
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		// TODO Auto-generated constructor stub
		this.nomeDoAtributo =nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return String.format("O atributo '%s' est� fora do intervalo.", nomeDoAtributo);
	}
}
