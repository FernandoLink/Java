package br.com.link.loja;

import java.math.BigDecimal;

import br.com.link.loja.imposto.CalculadoraDeImpostos;
import br.com.link.loja.imposto.ICMS;
import br.com.link.loja.imposto.ISS;
import br.com.link.loja.orcamento.ItemOrcamento;
import br.com.link.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		System.out.println(calculadora.calcular(orcamento, new ICMS(null)));
		System.out.println(calculadora.calcular(orcamento, new ISS(null)));
	}
}
