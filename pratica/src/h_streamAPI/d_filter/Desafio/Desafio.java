package h_streamAPI.d_filter.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {
	// Usar 2 Filters e 1 map
	
	public static void main(String[] args) {
		/*
		 * Dado uma lista de disciplinas:
		 * 
		 * (1) selecionar as que você tem passou;
		 * 
		 * (2) selecionar as de exatas
		 * 
		 * (3) concatenar "Esta disciplinas de Exatas já eliminadas"
		 * 
		 * */
		
		Disciplina disciplina1 = new Disciplina("Matematica Discreta","Exatas",9.8);
		Disciplina disciplina2 = new Disciplina("Estrutura de Dados","Computação",10.0);
		Disciplina disciplina3 = new Disciplina("Inteligencia Artificial","Computação",7.9);
		Disciplina disciplina4 = new Disciplina("Engenharia de Software IV","Gestão",5.7);
		Disciplina disciplina5 = new Disciplina("Estatistica Aplicada","Exatas",5.9);
		Disciplina disciplina6 = new Disciplina("Calculo I","Exatas",8.6);
		Disciplina disciplina7 = new Disciplina("Programação Linear","Exatas",5.2);
		
		List<Disciplina> disciplinas = Arrays.asList(disciplina1, disciplina2, disciplina3, disciplina4, disciplina5, disciplina6, disciplina7 );
		
		Predicate<Disciplina> aprovado = p -> p.nota >= 7;
		
		Predicate<Disciplina> isExatas = e -> e.area.equalsIgnoreCase("Exatas");
		
		Function<Disciplina, String> isEliminada = y -> "A disciplina \"" + y.nome + "\" de exatas esta elinada";
		
		disciplinas.stream().filter(isExatas).filter(aprovado).map(isEliminada).forEach(System.out::println);
		
	}

}
