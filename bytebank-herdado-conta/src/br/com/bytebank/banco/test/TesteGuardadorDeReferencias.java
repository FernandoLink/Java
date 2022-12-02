package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();

		Conta cc = new ContaCorrente(1, 2, 3, "Fernando Link");
		Conta cc1 = new ContaCorrente(4, 5, 6, "Fernando Link");

		guardador.adiciona(cc);
		guardador.adiciona(cc1);

		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);

		Conta ref = (Conta)guardador.getReferencia(1);
		System.out.println(ref);
	}

}
