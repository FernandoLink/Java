package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		ContaCorrente cc1 = new ContaCorrente(5000000.0, 1, 1, "Fernando");
		ContaCorrente cc2 = new ContaCorrente(2500000.0, 1, 2, "Valeria");
		ContaPoupanca cc3 = new ContaPoupanca(15000000.0, 1, 1, "Luiza");
		ContaPoupanca cc4 = new ContaPoupanca(12500000.0, 1, 2, "Henrique");
		ContaCorrente cc5 = new ContaCorrente(5000000.0, 1, 1, "Fernando");

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		lista.add(cc5);

		System.out.println(lista.contains(cc4));
		System.out.println(lista.contains(cc5));

		for (Object conta : lista) {
			if (conta.equals(cc5)) {
				System.out.println("Ja tenho esta conta! " + conta);
			}
		}

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
