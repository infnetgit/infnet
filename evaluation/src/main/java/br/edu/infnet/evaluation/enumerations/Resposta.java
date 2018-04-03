package br.edu.infnet.evaluation.enumerations;

public enum Resposta {
	DISCORDO_TOTALMENTE("Discordo totalmente"), DISCORDO_PARCIALMENTE("Discordo parcialmente"), INDIFERENTE(
			"Indiferente"), CONCORDO_PARCIALMENTE("Concordo parcialmente"), CONCORDO_TOTALMENTE(
					"Concordo totalmente"), NAO_SOU_CAPAZ_DE_OPINAR("Não sou capaz de opinar");

	private Resposta(String resposta) {
		this.resposta = resposta;
	}

	public String getResposta() {
		return resposta;
	}

	private String resposta;
}
