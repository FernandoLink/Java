package br.com.link.metodos.atributos;

// se quiser chamar dentro de um construtor outro utilizar this() e somente um
// não pode ter dois this()
// e tem que ser o primeiro no construtor, não pode ter nada antes do this()
// sobrecarga em construtor funciona da mesma forma de sobrecarga de método
class Livro {
	Livro() {
		System.out.println("sem argumentos");
	}

	Livro(int i) {
		this(valor());
		System.out.println("i => " + i);
	}

	Livro(String... s) {
		for (String str : s)
			System.out.print(str + ",");
		System.out.println();
	}

	static String valor() {
		return "xpto";
	}

}

public class TesteSobrecargaConstrutores {

	public static void main(String[] args) {
		Livro l = new Livro();
		l = new Livro(2);
		l = new Livro("A Mandibula de Caim", "Clean Code");
	}
}
