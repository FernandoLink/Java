package br.com.link.linkbank.domain.conta;

import br.com.link.linkbank.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente) {
}