package h_streamAPI.f_Match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import h_streamAPI.d_filter.Aluno;

public class Match {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Ana", 7.1);
		Aluno aluno2 = new Aluno("Luna", 5.1);
		Aluno aluno3 = new Aluno("Gui", 8.1);
		Aluno aluno4 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

		Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();

		// Todos os alunos foram aprovados?
		System.out.println(alunos.stream().allMatch(aprovado));

		// Algum aluno foi aprovado?
		System.out.println(alunos.stream().anyMatch(aprovado));

		// Nenhum foi reprovado?
		System.out.println(alunos.stream().noneMatch(reprovado));
	}

}
