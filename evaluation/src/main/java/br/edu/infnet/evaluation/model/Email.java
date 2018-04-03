package br.edu.infnet.evaluation.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Lob;

@Embeddable
public class Email {

	/**
	 * E-mail do aluno. A ideia é fazer: aluno.getEmail().getEndereco();
	 */
	@Column(name = "endereco_email")
	private String endereco;

	@Column(name = "assunto")
	private String assunto;

	@Lob
	@Column(name = "corpo")
	private String convite;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getConvite() {
		return convite;
	}

	public void setConvite(String convite) {
		this.convite = convite;
	}

}
