package br.com.link;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();

		alunos.add("Fernando Link");
		alunos.add("Valeria Cristina Souza Link");
		alunos.add("Luiza Souza Link");
		alunos.add("Henrique Souza Link");
		alunos.add("Arlete Terezinha Schelbauer");
		alunos.add("Luiz Schelbauer");
		alunos.add("Elba Athayde Schelbauer");
		alunos.add("Elba Athayde Schelbauer");
		alunos.add("Elba Athayde Schelbauer");
		alunos.add("Elba Athayde Schelbauer");

		System.out.println(alunos.contains("Fernando Link"));

		System.out.println(alunos.size());

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

	}
}
