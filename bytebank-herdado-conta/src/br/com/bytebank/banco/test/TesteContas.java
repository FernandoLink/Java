package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(100, 111, 111, "Fernando Link");

		ContaPoupanca cp = new ContaPoupanca(200, 222, 222, "Valeria Cristina Souza Link");

		cc.transfere(cp, 10.0);

		System.out.println(cc);
		System.out.println(cp);
		
	}

}
