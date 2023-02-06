package br.com.link.loja.pedido.acao;

import br.com.link.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido!");
	}
}
