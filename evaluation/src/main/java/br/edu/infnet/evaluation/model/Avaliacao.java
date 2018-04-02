package br.edu.infnet.evaluation.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Avaliacao implements Serializable {

	private static final long serialVersionUID = -3877906099521294116L;
	
@Id
@Column(name="cod_avaliacao")
	private String codigo;

@Lob
	private String objetivo;
	
@Temporal(TemporalType.TIMESTAMP)
	private Date inicio;

@Temporal(TemporalType.TIMESTAMP)
	private Date termino;

	private Boolean respondeu;

	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="mat_aluno")
	private Aluno respondente;

	@OneToOne
	@JoinColumn(name="cod_curso")
	private Curso curso;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cod_avaliacao")
	private List<Turma> turmas;

	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="mat_professor")
	private Professor professor;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cod_avaliacao")
	private List<Questao> questoes;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getTermino() {
		return termino;
	}

	public void setTermino(Date termino) {
		this.termino = termino;
	}

	public Boolean isRespondeu() {
		return respondeu;
	}

	public void setRespondeu(Boolean respondeu) {
		this.respondeu = respondeu;
	}

	public Aluno getRespondente() {
		return respondente;
	}

	public void setRespondente(Aluno respondente) {
		this.respondente = respondente;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	
	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
		result = prime * result + ((objetivo == null) ? 0 : objetivo.hashCode());
		result = prime * result + ((professor == null) ? 0 : professor.hashCode());
		result = prime * result + ((questoes == null) ? 0 : questoes.hashCode());
		result = prime * result + ((respondente == null) ? 0 : respondente.hashCode());
		result = prime * result + ((respondeu == null) ? 0 : respondeu.hashCode());
		result = prime * result + ((termino == null) ? 0 : termino.hashCode());
		result = prime * result + ((turmas == null) ? 0 : turmas.hashCode());
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
		Avaliacao other = (Avaliacao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		if (objetivo == null) {
			if (other.objetivo != null)
				return false;
		} else if (!objetivo.equals(other.objetivo))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		if (questoes == null) {
			if (other.questoes != null)
				return false;
		} else if (!questoes.equals(other.questoes))
			return false;
		if (respondente == null) {
			if (other.respondente != null)
				return false;
		} else if (!respondente.equals(other.respondente))
			return false;
		if (respondeu == null) {
			if (other.respondeu != null)
				return false;
		} else if (!respondeu.equals(other.respondeu))
			return false;
		if (termino == null) {
			if (other.termino != null)
				return false;
		} else if (!termino.equals(other.termino))
			return false;
		if (turmas == null) {
			if (other.turmas != null)
				return false;
		} else if (!turmas.equals(other.turmas))
			return false;
		return true;
	}

	
}
