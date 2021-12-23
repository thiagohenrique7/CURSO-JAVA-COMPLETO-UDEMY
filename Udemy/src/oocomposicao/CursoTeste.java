package oocomposicao;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno ("João");
		Aluno aluno2 = new Aluno ("Maria");
		Aluno aluno3 = new Aluno ("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web");
		Curso curso3 = new Curso("Python");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println(curso3.nome);
			System.out.println(aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);

		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Web");
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
