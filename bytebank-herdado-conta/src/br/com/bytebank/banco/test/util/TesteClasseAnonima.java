package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteClasseAnonima {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(333, 22, 44, "Fernando Link");
		Conta cc2 = new ContaCorrente(444, 22, 33, "Valeria Cristina Souza Link");
		Conta cc3 = new ContaPoupanca(111, 22, 11, "Luiza Souza Link");
		Conta cc4 = new ContaPoupanca(222, 22, 22, "Henrique Souza Link");

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		// Function Object
		lista.sort(new Comparator<Conta>() {

			@Override
			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getNumero(), c2.getNumero());
			}
		});

		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println("--------------Classe Anonima--------------");
		lista.sort(new Comparator<Conta>() {

			@Override
			public int compare(Conta c1, Conta c2) {
				return c1.getTitular().compareTo(c2.getTitular());
			}
		});

		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
}
