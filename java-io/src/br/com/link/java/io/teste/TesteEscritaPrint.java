package br.com.link.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrint {

	public static void main(String[] args) throws IOException {

		long ini = System.currentTimeMillis();

		// PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem2.txt");

		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println("seila seila teste testes testes");

		long fim = System.currentTimeMillis();

		System.out.println("Passaram " + (fim - ini) + " milisegundos.");

		ps.close();
	}

}
