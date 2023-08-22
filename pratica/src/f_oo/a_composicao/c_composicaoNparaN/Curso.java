package f_oo.a_composicao.c_composicaoNparaN;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome) {
		this.nome = nome;
	}

	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno); // Adicionando esse aluno ao curso
		aluno.cursos.add(this); // Adicionando esse curso ao aluno 
	}
	
	@Override
	public String toString() {
		return this.nome;
	}

}
