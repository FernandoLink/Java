package br.com.link.screen.match.services;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.link.screen.match.models.Title;
import br.com.link.screen.match.models.TitleOmdb;

public class OmdbApiService {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner leitura = new Scanner(System.in);
		String busca = "";
		List<Title> titles = new ArrayList<>();
		Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting()
				.create();

		while (!busca.equalsIgnoreCase("sair")) {
			System.out.println("Nome do filme ou Sair para encerrar: ");
			busca = leitura.nextLine();
			if (busca.equalsIgnoreCase("sair"))
				break;

			String chave = "6585022c";
			String url = "https://www.omdbapi.com/?t=" + busca.replaceAll(" ", "+") + "&plot=full&&apikey=" + chave;

			try {
				HttpClient client = HttpClient.newHttpClient();
				HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
				HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

				System.out.println(new Gson().fromJson(response.body(), Title.class));

				TitleOmdb omdb = gson.fromJson(response.body(), TitleOmdb.class);
				System.out.println(omdb);

				Title title = new Title(omdb.title(), omdb.year(), omdb.rated(), omdb.released(), omdb.runtime(),
						omdb.genre(), omdb.director(), omdb.writer(), omdb.actors(), omdb.plot(), omdb.language(),
						omdb.country(), omdb.awards(), omdb.poster(), omdb.ratings(), omdb.metascore(),
						omdb.imdbRating(), omdb.imdbVotes(), omdb.imdbID(), omdb.type(), omdb.totalSeasons(),
						omdb.dvd(), omdb.boxOffice(), omdb.production(), omdb.website(), omdb.response());
				System.out.println(title);
				titles.add(title);
			} catch (Exception e) {
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
			}
		}
		System.out.println(titles);

		FileWriter fw = new FileWriter("filmes.json");
		fw.write(gson.toJson(titles));
		fw.close();

		System.out.println("The End");
	}
}
