package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		ContaCorrente cc1 = new ContaCorrente(5000000.0, 1, 1, "Fernando");
		ContaCorrente cc2 = new ContaCorrente(5000000.0, 1, 2, "Valeria");
		ContaPoupanca cc3 = new ContaPoupanca(5000000.0, 1, 1, "Luiza");
		ContaPoupanca cc4 = new ContaPoupanca(5000000.0, 1, 2, "Henrique");

		lista.add(cc1);
		lista.add(cc2);

		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println(lista.get(0));

		lista.remove(1);
		System.out.println(lista.size());

		lista.add(cc3);
		lista.add(cc4);

		for (Conta ref : lista) {
			System.out.println(ref);
		}

	}

}
