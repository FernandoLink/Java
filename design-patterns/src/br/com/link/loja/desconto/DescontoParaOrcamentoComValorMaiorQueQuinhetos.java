package br.com.link.loja.desconto;

import java.math.BigDecimal;

import br.com.link.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhetos extends Desconto {

	public DescontoParaOrcamentoComValorMaiorQueQuinhetos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
}
