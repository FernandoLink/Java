package br.com.link.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.link.loja.orcamento.ItemOrcamento;
import br.com.link.loja.orcamento.Orcamento;
import br.com.link.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(a -> a.executarAcao(pedido));
	}
}