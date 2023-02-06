package br.com.link.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.link.loja.pedido.GeraPedido;
import br.com.link.loja.pedido.GeraPedidoHandler;
import br.com.link.loja.pedido.acao.EnviarEmailPedido;
import br.com.link.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadesItens = Integer.parseInt(args[2]);

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadesItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));
		handler.execute(gerador);
	}

}
