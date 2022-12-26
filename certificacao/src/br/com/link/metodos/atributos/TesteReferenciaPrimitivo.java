package br.com.link.metodos.atributos;

class Prova {
	int tempo;
}

public class TesteReferenciaPrimitivo {
	public static void main(String[] args) {
		int i = 2;
		teste(i);
		System.out.println(i);

		Prova prova = new Prova();
		prova.tempo = 100;
		System.out.println(prova.tempo);
		teste(prova);
		System.out.println(prova.tempo);
	}

	static void teste(int i) {
		i++;
		System.out.println(i);
	}

	static void teste(Prova prova) {
		prova.tempo = 210;
	}
}
