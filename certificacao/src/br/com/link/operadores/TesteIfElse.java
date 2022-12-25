package br.com.link.operadores;

public class TesteIfElse {
	public static void main(String[] args) {
		boolean autentico = true;
		// o resultado da condição sempre tem que ser um boolean
		if (autentico) {
			System.out.println("Ok");
		} else {
			System.out.println("Nao autenticado");
		}

		boolean valor;
		// se o resultado da atribuição for um boolean funciona
		if (valor = true) {
			System.out.println("Ok");
		}

		if (valor)
			System.out.println("OK");
		else
			System.out.println("Nao OK");

		// else sem o if não pode deve ser o último comando
		if (valor) {
			System.out.println("OK");
		} else if (!valor) {
			System.out.println("nao ok");
		} else {
			System.out.println("else");
		}
	}
}
