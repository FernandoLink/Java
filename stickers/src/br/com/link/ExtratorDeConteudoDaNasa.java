package br.com.link;

import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDaNasa implements ExtratorDeConteudo {

	@Override
	public List<Conteudo> extraiConteudos(String json) {

		// extrair s� os dados que interessam (titulo, poster, classifica��o)
		var parser = new JsonParser();
		List<Map<String, String>> listaDeAtributos = parser.parse(json);

		return listaDeAtributos.stream()
				.map(atributos -> new Conteudo(atributos.get("copyright"), atributos.get("url"))).toList();

	}

}
