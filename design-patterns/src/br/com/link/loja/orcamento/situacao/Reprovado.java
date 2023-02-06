package br.com.link.loja.orcamento.situacao;

import br.com.link.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
