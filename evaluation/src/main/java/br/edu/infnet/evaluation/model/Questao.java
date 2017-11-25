package br.edu.infnet.evaluation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Questao {
private Integer codigo;

@OneToOne
private Curso curso;

@Column
private String descricao;

//Aqui deve ser uma enum. Verificar como fazer o mapeamento.
private List<String> alternativas;

public Integer getCodigo() {
	return codigo;
}

public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}

public Curso getCurso() {
	return curso;
}

public void setCurso(Curso curso) {
	this.curso = curso;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public List<String> getAlternativas() {
	return alternativas;
}

public void setAlternativas(List<String> alternativas) {
	this.alternativas = alternativas;
}


}
