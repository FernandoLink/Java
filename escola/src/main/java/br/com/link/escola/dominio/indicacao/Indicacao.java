package br.com.link.escola.dominio.indicacao;

import java.time.LocalDateTime;

import br.com.link.escola.dominio.aluno.Aluno;

public class Indicacao {

	private Aluno indicado;
	private Aluno indicante;
	private LocalDateTime dataIndicacao;

	public Indicacao(Aluno indicado, Aluno indicante) {
		this.indicado = indicado;
		this.indicante = indicante;
		this.dataIndicacao = LocalDateTime.now();
	}
}
