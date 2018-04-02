package br.edu.infnet.evaluation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NaturalId;

import br.edu.infnet.evaluation.enumerations.Resposta;

@Entity
public class Questao implements Serializable {

	private static final long serialVersionUID = 8843242245478530980L;

	@Id
	@Column(name = "cod_questao")
	private String codigo;

	/**
	 * Texto que representa a pergunta a ser feita ao respondente.
	 */
	@Lob
	private String cabecalho;

	@ManyToOne
	@JoinColumn(name = "mat_aluno")
	private Aluno respondente;

	/**
	 * Enum que representa as opções dadas ao respondente como discordo,
	 * discordo parcialmente, concordo e etc.
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "resposta", nullable = false, updatable = false)
	private Resposta resposta;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCabecalho() {
		return cabecalho;
	}

	public void setCabecalho(String cabecalho) {
		this.cabecalho = cabecalho;
	}

	public Aluno getRespondente() {
		return respondente;
	}

	public void setRespondente(Aluno respondente) {
		this.respondente = respondente;
	}

	public Resposta getResposta() {
		return resposta;
	}

	public void setResposta(Resposta resposta) {
		this.resposta = resposta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cabecalho == null) ? 0 : cabecalho.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((respondente == null) ? 0 : respondente.hashCode());
		result = prime * result + ((resposta == null) ? 0 : resposta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questao other = (Questao) obj;
		if (cabecalho == null) {
			if (other.cabecalho != null)
				return false;
		} else if (!cabecalho.equals(other.cabecalho))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (respondente == null) {
			if (other.respondente != null)
				return false;
		} else if (!respondente.equals(other.respondente))
			return false;
		if (resposta != other.resposta)
			return false;
		return true;
	}

}