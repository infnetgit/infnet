package br.edu.infnet.evaluation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.edu.infnet.evaluation.conexao.HibernateUtil;
import br.edu.infnet.evaluation.model.Aluno;
import br.edu.infnet.evaluation.model.Avaliacao;
import br.edu.infnet.evaluation.model.Bloco;
import br.edu.infnet.evaluation.model.Curso;
import br.edu.infnet.evaluation.model.Modulo;
import br.edu.infnet.evaluation.model.Periodo;
import br.edu.infnet.evaluation.model.Professor;
import br.edu.infnet.evaluation.model.Questao;
import br.edu.infnet.evaluation.model.Turma;

public class Teste {
	private Session sessao;

public Teste(Session sessao) {
		this.sessao = sessao;
	}

public void salvar(Object obj) {
	sessao.save(obj);
}

public static void main(String[] args) {
	Session sessao = HibernateUtil.getSessionFactory().openSession(); 
	Transaction transacao = sessao.beginTransaction(); 
Teste teste = new Teste(sessao);
Aluno aluno = new Aluno();
aluno.setNome("Carlos Willians");

Avaliacao avaliacao = new Avaliacao();
avaliacao.setCodigo("100");

List<Bloco> blocos = new ArrayList<Bloco>();
Bloco bloco = new Bloco();
bloco.setCodigo("3123");
blocos.add(bloco);

Curso curso = new Curso();
curso.setBlocos(blocos);
curso.setCodigo(1234);

Modulo modulo = new Modulo();
modulo.setCodigo("1344");

Periodo periodo = new Periodo();
periodo.setCodigo("13334");

Professor professor = new Professor();
professor.setNome("Roberto");

Questao questao = new Questao();
questao.setDescricao("Teste");

Turma turma = new Turma();
turma.setCodigo("13446");

teste.salvar(aluno);
teste.salvar(avaliacao);
teste.salvar(bloco);
teste.salvar(curso);
teste.salvar(modulo);
teste.salvar(periodo);
teste.salvar(professor);
teste.salvar(questao);
teste.salvar(turma);
transacao.commit();
System.out.println("Tabelas criadas");
	 	 }
}
