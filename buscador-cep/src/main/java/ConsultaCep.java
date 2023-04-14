import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConsultaCep {

	public Endereco buscaEndereco(String cep) {

		URI uri = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

		try {
			HttpResponse<String> response = HttpClient.newHttpClient().send(HttpRequest.newBuilder().uri(uri).build(),
					HttpResponse.BodyHandlers.ofString());
			return new Gson().fromJson(response.body(), Endereco.class);
		} catch (Exception e) {
			throw new RuntimeException("Nao consegui obter o endereco a partir deste CEP: " + cep, e);
		}
	}
}
