package f_oo.a_composicao.c_composicaoNparaN;

public class NNTeste {
	
	public static void main(String[] args) {
		
		// Instanciando Alunos
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");

		// Instanciando cursos
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		// adicionando aluno atraves do curso
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		// adicionando curso atraves do aluno
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		// percorrendo arraylist de alunos, do curso 1
		for (Aluno aluno : curso1.alunos) {
			System.out.printf("Me chamo %s e estou matriculado no curso 1\n", aluno.nome);
		}
		
		// percorrendo arraylist de alunos, do curso 3
		for (Aluno aluno : curso3.alunos) {
			System.out.printf("Me chamo %s e estou matriculado no curso 3\n", aluno.nome);
		}
		
		// Imprime os alunos que estão no curso 0 do aluno 1
		System.out.println(aluno1.cursos.get(0).alunos); 
		
		// Utilizando método curso encontrado
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
	
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
			
		}
	
	}
	
	

}
