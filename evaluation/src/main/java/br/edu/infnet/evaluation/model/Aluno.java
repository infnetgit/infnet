package br.edu.infnet.evaluation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Aluno {

	@Id
	@GeneratedValue
	private Long matricula;
	
@Column
	private String nome;

@Column
	private String email;

	@ManyToOne
	@JoinColumn(name = "codigo")
	private Curso curso;

	@OneToMany
	private List<Modulo> modulos;

	@OneToOne
	private Periodo periodo;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

}