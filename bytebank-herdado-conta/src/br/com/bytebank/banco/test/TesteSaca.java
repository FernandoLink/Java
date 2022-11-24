package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente(200, 123, 321, "Fernando Link");

		try {
			cc.saca(200);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}

	}
}
