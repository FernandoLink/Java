package br.com.alura.alurator;

import java.util.Map;

import br.com.alura.alurator.protocolo.Request;
import br.com.alura.alurator.reflexao.Reflexao;

public class Alurator {

	private String packageBase;

	public Alurator(String packageBase) {
		this.packageBase = packageBase;
	}

	public Object executa(String url) throws NoSuchMethodException, SecurityException {

		Request request = new Request(url);
		String nameController = request.getNomeControle();
		String nomeMetodo = request.getNomeMetodo();
		Map<String, Object> params = request.getQueryParams();

		Object retorno = new Reflexao().refleteClasse(packageBase + nameController).criaInstancia()
				.getMetodo(nomeMetodo, params).invoca();

		return retorno;
	}
}
