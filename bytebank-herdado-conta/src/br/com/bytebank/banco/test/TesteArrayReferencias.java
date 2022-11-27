package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(1, 2, 3, "Fernando Link");
		ContaCorrente cc2 = new ContaCorrente(2, 3, 4, "Valeria Cristina Souza Link");
		ContaPoupanca cc3 = new ContaPoupanca(4, 5, 6, "Luiza Souza Link");
		ContaPoupanca cc4 = new ContaPoupanca(7, 8, 9, "Henrique Souza Link");

		// Valor padrão de uma referência é null
		Conta[] contas = { cc1, cc2, cc3, cc4 };

		for (Conta cc : contas) {
			System.out.println(cc);
		}

		// Type Cast
		ContaPoupanca ref = (ContaPoupanca) contas[2];
		System.out.println(ref);

	}

}
