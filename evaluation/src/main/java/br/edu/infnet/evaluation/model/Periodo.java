package br.edu.infnet.evaluation.model;

public enum Periodo {
MANHA("Manhã"), TARDE("Tarde"), NOITE("Noite");
	
	private Periodo(String periodo) {
		this.periodo = periodo;
	}
	
	public String getPeriodo() {
		return periodo;
	}

	private String periodo;
}
