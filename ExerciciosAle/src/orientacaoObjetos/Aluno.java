package orientacaoObjetos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String nome;
	final List<Curso> cursos = new ArrayList<>();//não pode alterar a referência
	//espaço de memória, que está alocada a lista... 
	
	Aluno(String nome){
		this.nome = nome;
	}
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	public String toString() {
		return nome;
	}
}
