package br.com.link.loja.orcamento;

import java.util.Map;

import br.com.link.loja.DomainException;
import br.com.link.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

	private HttpAdapter http;

	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento não finalizado!");
		}
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidadesItens",
				orcamento.getQuantidadeItens());
		http.post(url, dados);
	}

}
