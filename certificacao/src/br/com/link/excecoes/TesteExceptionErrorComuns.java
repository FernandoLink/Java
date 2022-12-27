package br.com.link.excecoes;

import java.util.ArrayList;
import java.util.Date;

class NovaConta {
	double saldo = 100;

	public void saca(double valor) {
		if (saldo < valor) {
			throw new IllegalArgumentException();
		}
		saldo -= valor;
	}
}

class Tarefa {
	boolean rodando = false;

	void start() {
		if (rodando) {
			throw new IllegalStateException();
		}
		rodando = true;
	}

	void stop() {
		rodando = false;
	}
}

class BlocoEstatico {
	static {
		String s = null;
		s.length();
	}
}

public class TesteExceptionErrorComuns {

	void metodo() {
		metodo();
	}

	public static void main(String[] args) {
		int[] x = new int[56];
		// ArrayIndexOutOfBoundsException
		// x[-56] = 13;

		ArrayList<String> l = new ArrayList<>();
		l.add("fernando");
		l.add("link");
		// IndexOutOfBoundsException
		// l.get(2);

		String s = null;
		// NullPointerException:
		// s.length();

		Object o = "Fernando Link";
		// ClassCastException
		// Date d = (Date) o;

		String n1 = "1a";
		// NumberFormatException
		// int um = Integer.parseInt(n1);

		// llegalArgumentException
		// new NovaConta().saca(300);

		Tarefa t = new Tarefa();
		// IllegalStateException
		// t.start();
		// t.start();

		// IllegalStateException
		// new BlocoEstatico();

		// StackOverflowError
		// new TesteExceptionErrorComuns().metodo();
		
		// NoClassDefFoundError
		
		// OutOfMemoryError		
		
	}
}
