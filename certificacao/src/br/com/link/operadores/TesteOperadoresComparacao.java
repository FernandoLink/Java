package br.com.link.operadores;

// na comparação ignora o tipo
public class TesteOperadoresComparacao {
	public static void main(String[] args) {

		System.out.println(1 == 1);
		System.out.println(1 != 1);
		System.out.println(1.0 == 1);
		System.out.println(1.0f == 1.0);

		System.out.println(2 >= 1);
		System.out.println(2 <= 1);
		System.out.println(2 > 1);
		System.out.println(2 < 1);

		System.out.println(true == false);
		System.out.println(true != false);

		// cuidado com o operador de atribuição
		int idade = 25;
		// devolve o resultado da atribuição
		System.out.println(idade = 25);

		boolean mentira = false;
		// devolve o resultado da atribuição
		System.out.println(mentira = true);

	}
}
