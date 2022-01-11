package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervalo extends RuntimeException {
	private String nomeDoAtributo;
	public NumeroForaIntervalo(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	public String getMessage() {
		
		return String.format("O atributo '%s' esta fora do intervalo", nomeDoAtributo);
	}
}
