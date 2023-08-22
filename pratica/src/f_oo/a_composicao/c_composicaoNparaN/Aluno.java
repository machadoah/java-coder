package f_oo.a_composicao.c_composicaoNparaN;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	String nome;
	final List<Curso> cursos = new ArrayList<>();

	public Aluno(String nome) {
		this.nome = nome;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso); // Adicionando esse curso ao aluno
		curso.alunos.add(this); // Adicionando esse aluno ao curso
	}

	Curso obterCursoPorNome(String nome) {
		for (Curso curso : cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		// converte um objeto para formato String
		return this.nome;
	}

}
