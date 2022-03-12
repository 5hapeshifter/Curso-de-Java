package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervalo extends Exception {

	private String nomeDoAtributo;
	
	public NumeroForaIntervalo(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		
		return String.format("O atributo '%s' está fora do intervalo!", nomeDoAtributo);
	}
	
}
