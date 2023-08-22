package h_streamAPI.e_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import h_streamAPI.d_filter.Aluno;

public class Reduce2 {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Ana", 7.1);
		Aluno aluno2 = new Aluno("Luna", 6.1);
		Aluno aluno3 = new Aluno("Gui", 8.1);
		Aluno aluno4 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

		Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
		Function<Aluno, Double> apenasNota = a -> a.getNota();
		BinaryOperator<Double> somatorio = (a, b) -> a + b;

		alunos.parallelStream().filter(aprovado).map(apenasNota).reduce(somatorio).ifPresent(System.out::println);

	}

}
