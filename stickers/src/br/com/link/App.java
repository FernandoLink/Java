package br.com.link;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {

	public static void main(String[] args) throws Exception {

		API api = API.NASA;

		String url = api.getUrl();
		ExtratorDeConteudo extrator = api.getExtrator();

		var http = new ClienteHttp();
		String json = http.buscaDados(url);

		// exibir e manipular os dados
		List<Conteudo> conteudos = extrator.extraiConteudos(json);

		var geradora = new GeradorDeFigurinhas();

		for (int i = 0; i < 3; i++) {

			Conteudo conteudo = conteudos.get(i);

			InputStream inputStream = new URL(conteudo.urlImagem()).openStream();
			String nomeArquivo = conteudo.titulo() + ".png";

			geradora.cria(inputStream, nomeArquivo);

			System.out.println(conteudo.titulo());
			System.out.println();
		}
	}
}