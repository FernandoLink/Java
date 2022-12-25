package br.com.link.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class TesteArrayListIterator {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("Java");
		nomes.add("Python");
		nomes.add("Rust");

		for (String nome : nomes) {
			System.out.println(nome);
		}

		Iterator<String> it = nomes.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(nomes.size());

		Cliente c = new Cliente();
		c.nome = "Link";

		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(c);

		System.out.println(c.nome);
		System.out.println(clientes.get(0).nome);

		c.nome = "Fernando Link";
		System.out.println(c.nome);
		System.out.println(clientes.get(0).nome);

		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "a");
		a.add(1, "b");
		for (Iterator<String> i = a.iterator(); i.hasNext();) {
			String element = i.next();
			System.out.println(element);
		}
	}
}
