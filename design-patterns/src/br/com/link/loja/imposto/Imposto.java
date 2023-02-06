package br.com.link.loja.imposto;

import java.math.BigDecimal;

import br.com.link.loja.orcamento.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);
}
