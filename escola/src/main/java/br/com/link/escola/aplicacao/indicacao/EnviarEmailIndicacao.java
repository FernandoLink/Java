package br.com.link.escola.aplicacao.indicacao;

import br.com.link.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

	void enviarPara(Aluno indicado);

}
