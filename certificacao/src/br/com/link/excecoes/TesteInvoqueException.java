package br.com.link.excecoes;

class SalsoInsuficienteException extends Exception {
	public SalsoInsuficienteException(String msg) {
		super(msg);
	}
}

class ContaDoBem {
	double saldo = 100.0;

	void saca(double quantidade) throws SalsoInsuficienteException {
		if (this.saldo < quantidade) {
			throw new SalsoInsuficienteException("Saldo Insuficiente " + saldo + " para sacar");
		}
		saldo -= quantidade;
	}
}

public class TesteInvoqueException {

	public static void metodo1() {
		System.out.println("primeiro antes");
		try {
			metodo2();
			System.out.println("primeiro depois");
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("fim do metodo 1");
		}
	}

	public static void metodo2() {
		String s = null;
		System.out.println("segundo antes");
		s.length();
		System.out.println("segundo depois");
		System.out.println("fim do metodo 2");
	}

	// exceptions checked tem que lançar ou try/catch
	public static void main(String[] args) throws SalsoInsuficienteException {
		metodo1();

		new ContaDoBem().saca(500);
	}
}
