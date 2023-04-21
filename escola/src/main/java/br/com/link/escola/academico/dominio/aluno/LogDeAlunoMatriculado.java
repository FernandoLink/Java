package br.com.link.escola.academico.dominio.aluno;

import java.time.format.DateTimeFormatter;

import br.com.link.escola.shared.dominio.evento.Evento;
import br.com.link.escola.shared.dominio.evento.Ouvinte;

public class LogDeAlunoMatriculado extends Ouvinte {

	@Override
	public void reageAo(Evento evento) {
		String momentoFormato = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println(String.format("Aluno com CPF %s matriculado em %s.",
				((AlunoMatriculado) evento).getCpfDoAluno(), momentoFormato));
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento instanceof AlunoMatriculado;
	}
}
