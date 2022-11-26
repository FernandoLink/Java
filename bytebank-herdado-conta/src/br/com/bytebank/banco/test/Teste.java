package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(1,2,3,"Link");
		ContaPoupanca cp = new ContaPoupanca(1,2,3,"FLink");
		Cliente cl = new Cliente();
		cl.setCpf("81628927968");
		cl.setNome("Fernando Link");
		cl.setProfissao("Analista de Sistemas");
		
		System.out.println(cc);
		System.out.println(cp);
		System.out.println(cl);
		
		println(cc);
		println(cp);
		println(cl);

	}
	
	static void println() {}

	static void println(int a) {}

	static void println(boolean valor) {}
	
	static void println(Object referencia) {
		System.out.println(referencia.getClass());
	}
}
