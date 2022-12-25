package br.com.link.arrays;

import java.util.ArrayList;

// Quando não sabe o tamanho do array foi criado o ArrayList
public class TesteArrayList {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("Java");
		nomes.add("Python");
		nomes.add("Rust");
		nomes.add("Rust");
		nomes.add("Rust");
		nomes.add("Rust");
		System.out.println(nomes);
		System.out.println(nomes.contains("Rust"));
		System.out.println(nomes.remove("Rust"));
		System.out.println(nomes.remove(3));
		System.out.println(nomes);
		System.out.println(nomes.size());

		// toArray sempre devolver array de Object
		Object[] objetos = nomes.toArray();

		// 2 formas para converter para um array de strings
		String[] nomesArray = nomes.toArray(new String[nomes.size()]);
		String[] nomesArray2 = nomes.toArray(new String[0]);

		ArrayList<String> paises = new ArrayList<>();
		paises.add("Brasil");
		paises.add("Alemanha");
		System.out.println(paises);
		
		ArrayList<String> tudo = new ArrayList<>();
		tudo.addAll(nomes);
		tudo.addAll(paises);
		System.out.println(tudo);
		
		System.out.println(tudo.get(0));
		System.out.println(tudo.get(1));
		System.out.println(tudo.get(2));
		System.out.println(tudo.get(3));
		System.out.println(tudo.get(4));
		
		tudo.add(3, "PHP");
		tudo.set(4, "JavaScript");
		System.out.println(tudo);
		
		System.out.println(tudo.indexOf("PHP"));
		System.out.println(tudo.indexOf("Brasil"));
	}
}
