package br.com.link.versao;

public class SwitchExpressions {

	// Switch Expressions
	public static void main(String[] args) {

		String nome = "Fernando";

		switch (nome) {
			case "Fernando" -> System.out.println(nome);
			case "Val�ria" -> System.out.println(nome);
			default -> System.out.println(nome);
		}
	}
}
