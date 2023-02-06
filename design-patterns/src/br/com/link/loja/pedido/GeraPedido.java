package br.com.link.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadesItens;

	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadesItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadesItens = quantidadesItens;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public void setValorOrcamento(BigDecimal valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}

	public int getQuantidadesItens() {
		return quantidadesItens;
	}

	public void setQuantidadesItens(int quantidadesItens) {
		this.quantidadesItens = quantidadesItens;
	}

}
