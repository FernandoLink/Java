package br.com.link.versao.dez;

import java.util.HashMap;

public class TypeVar {

	// Inferência de variáveis (var)
	// var só pode ser utilizado no contexto de métodos em variáveis locais
	// cuidar do generics pois se não passar String String ele vai devolver Object
	// Object
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Fernando Link", "816.289.279-68");
		System.out.println(cpfPorNomes);
	}
}
