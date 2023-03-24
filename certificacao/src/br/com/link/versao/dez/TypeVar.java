package br.com.link.versao.dez;

import java.util.HashMap;

public class TypeVar {

	// Infer�ncia de vari�veis (var)
	// var s� pode ser utilizado no contexto de m�todos em vari�veis locais
	// cuidar do generics pois se n�o passar String String ele vai devolver Object
	// Object
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Fernando Link", "816.289.279-68");
		System.out.println(cpfPorNomes);
	}
}
