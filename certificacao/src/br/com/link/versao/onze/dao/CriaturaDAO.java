package br.com.link.versao.onze.dao;

import java.util.List;
import java.util.Map;

public class CriaturaDAO {

	public void listar() {
		Map<String, List<String>> criaturas = Map.of("nome", List.of("Shewbacca, Yoda, Pikachu"));
		System.out.println("[" + criaturas + "]");
	}
}
