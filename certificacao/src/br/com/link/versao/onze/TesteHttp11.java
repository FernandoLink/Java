package br.com.link.versao.onze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TesteHttp11 {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://www.casadocodigo.com.br");
		URLConnection uc = url.openConnection();

		BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));

		String line = "";
		while (br.readLine() != null) {
			line = br.readLine();
			System.out.println(line);
		}
	}
}
