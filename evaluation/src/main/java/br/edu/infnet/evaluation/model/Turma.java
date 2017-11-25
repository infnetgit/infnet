package br.edu.infnet.evaluation.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Turma {

	@Id
	private String codigo;

	@OneToMany
	private List<Modulo> modulos;

	@OneToOne
	private Professor titular;

	@OneToMany
	private List<Aluno> alunos;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}

	public Professor getTitular() {
		return titular;
	}

	public void setTitular(Professor titular) {
		this.titular = titular;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
