package br.com.link;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Fernando Link");

		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando um aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 21));

		javaColecoes.getAulas().forEach(aula -> {
			System.out.println(aula);
		});

		Aluno a1 = new Aluno("Fernando Link", 1);
		javaColecoes.matricula(a1);
		javaColecoes.matricula(new Aluno("Valeria Cristina Souza Link", 2));
		javaColecoes.matricula(new Aluno("Luiza Souza Link", 3));
		javaColecoes.matricula(new Aluno("Henrique Souza Link", 4));

		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println(javaColecoes);

		Aluno link = new Aluno("Fernando Link", 1);
		System.out.println(javaColecoes.estaMatriculado(link));

		System.out.println(a1.equals(link));

		System.out.println(a1.hashCode() == link.hashCode());

		// forma antiga
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}

		// forma mais recente mas antiga também antes do Java 8
		for (Aluno a : javaColecoes.getAlunos()) {
			System.out.println(a);
		}
	}
}
