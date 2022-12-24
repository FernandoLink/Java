package br.com.link.operadores;

import java.util.ArrayList;
import java.util.List;

// se a expressão do lado direito for menos abrangente
// do que do lado esquerdo
public class TesteOperadores {
	public static void main(String[] args) {
		// byte -> short -> int -> long
		// float -> double
		// char (lembre-se char é só positivo)
		int a = 10;
		System.out.println(a);
		long b = 52;
		System.out.println(b);
		short c = 3;
		System.out.println(c);
		byte d = 4;
		System.out.println(d);
		float e = 40.3f;
		System.out.println(e);
		double f = 30.0;
		System.out.println(f);
		double g = f;
		System.out.println(g);
		char h = 65;
		System.out.println(h);

		ArrayList<String> lista1 = new ArrayList<>();
		List<String> lista2 = lista1;
		// List é mais genérico do que ArrayList tem que fazer um cast
		lista1 = (ArrayList<String>) lista2;
		lista2.add("Link");
		System.out.println(lista1.size() == lista2.size());
	}
}
