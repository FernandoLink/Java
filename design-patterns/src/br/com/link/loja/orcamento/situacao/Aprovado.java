package br.com.link.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.link.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {

	public BigDecimal calcularValorDescontroExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
