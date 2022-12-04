package br.com.link;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Fernando Link");

		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando um aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 21));

		javaColecoes.matricula(new Aluno("Fernando Link", 12345));
		javaColecoes.matricula(new Aluno("Valeria Cristina Souza Link", 23456));
		javaColecoes.matricula(new Aluno("Luiza Souza Link", 34567));
		javaColecoes.matricula(new Aluno("Henrique Souza Link", 45678));

		Aluno aluno = javaColecoes.buscaMatriculado(45678);
		System.out.println(aluno);
	}

}
