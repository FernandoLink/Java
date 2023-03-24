package br.com.link.versao.nove;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsOf {

	// Factory Method to Collections
	public static void main(String[] args) {
		List<String> lista = List.of("Fernando Link", "Valéria Cristina Souza Link", "Luiza Souza Link",
				"Henrique Souza Link");
		Set<String> set = Set.of("Fernando Link");
		Map<String, String> map = Map.of("Nome", "Valéria Cristina Souza Link");

		System.out.println(lista);
		System.out.println(set);
		System.out.println(map);
	}
}
