package h_streamAPI.j.OutrasStreams;

import java.util.Arrays;
import java.util.List;

import h_streamAPI.d_filter.Aluno;

public class Outros {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Ana", 7.1);
		Aluno aluno2 = new Aluno("Luna", 6.1);
		Aluno aluno3 = new Aluno("Gui", 8.1);
		Aluno aluno4 = new Aluno("Gabi", 10);
		Aluno aluno5 = new Aluno("Ana", 10);
		Aluno aluno6 = new Aluno("Pedro", 10);
		Aluno aluno7 = new Aluno("Gui", 10);
		Aluno aluno8 = new Aluno("Maria", 10);

		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8);

		System.out.println("District");
		alunos.stream().distinct().forEach(System.out::println); // Remove os duplicados!
		
		System.out.println("\nSkip/Limit");
		alunos.stream().distinct().limit(2).forEach(System.out::println);
		System.out.println("\nLimit");
		alunos.stream().distinct().limit(2).skip(2).forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
		alunos.stream().distinct().skip(2).takeWhile(a -> a.getNota() >= 7).forEach(System.out::println);
	}
}
