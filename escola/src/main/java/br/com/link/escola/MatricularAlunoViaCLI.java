package br.com.link.escola;

import br.com.link.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.link.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.link.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaCLI {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executa(new MatricularAlunoDto(nome, cpf, email));
	}
}
