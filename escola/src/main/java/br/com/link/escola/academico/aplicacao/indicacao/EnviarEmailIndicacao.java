package br.com.link.escola.academico.aplicacao.indicacao;

import br.com.link.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

	void enviarPara(Aluno indicado);

}
