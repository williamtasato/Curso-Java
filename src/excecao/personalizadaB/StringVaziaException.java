package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	
	private String nomeDoAtributo;
	public StringVaziaException(String nomeDoAtributo) {
		// TODO Auto-generated constructor stub
		this.nomeDoAtributo =nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return String.format("O atributo '%s' est� vazio.", nomeDoAtributo);
	}
}
