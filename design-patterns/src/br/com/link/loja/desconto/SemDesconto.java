package br.com.link.loja.desconto;

import java.math.BigDecimal;

import br.com.link.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
