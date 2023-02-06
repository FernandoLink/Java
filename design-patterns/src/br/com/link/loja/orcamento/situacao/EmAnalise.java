package br.com.link.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.link.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento{

	public BigDecimal calcularValorDescontroExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
}
