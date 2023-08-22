package h_streamAPI.i_MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import h_streamAPI.d_filter.Aluno;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno1 = new Aluno("Ana", 7.1);
		Aluno aluno2 = new Aluno("Luna", 5.1);
		Aluno aluno3 = new Aluno("Gui", 8.1);
		Aluno aluno4 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

		Comparator<Aluno> melhorNota = (a1, a2) -> {
			if (a1.getNota() > a2.getNota())
				return 1;
			if (a2.getNota() < a2.getNota())
				return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());

	}

}
