package br.com.link.loja;

import java.math.BigDecimal;

import br.com.link.loja.http.JavaHttpCliente;
import br.com.link.loja.orcamento.ItemOrcamento;
import br.com.link.loja.orcamento.Orcamento;
import br.com.link.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		orcamento.aprovar();
		orcamento.finalizar();

		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpCliente());
		registro.registrar(orcamento);

	}

}
