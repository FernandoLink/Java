package br.com.link.chamar.metodos.objetos;

class Pessoa {
	String nome;
	int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void imprime() {
		// pode invocar um método de instancia e this é opcional
		System.out.println(getNome());
	}
}

class Calculadora {
	// varargs é um array
	// e se tiver mais parâmetros o varargs tem que ser o último
	public int soma(int... numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}
}

public class TesteChamarMetodosObjetos {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		// argumentos são obrigatórios
		p.setNome("Fernando Link", 52);
		String nome = p.getNome();
		// quando o método devolve algo não é necessário atribuir a nada
		p.getNome();
		System.out.println(p.getNome());
		System.out.println(p.idade);
		p.imprime();

		Calculadora c = new Calculadora();
		System.out.println(c.soma(3, 5));
		System.out.println(c.soma(3, 5, 4));
		System.out.println(c.soma(3, 5, 6, 8, 4, 6, 7, 0, 1));
		System.out.println(c.soma(3));
		// pode enviar um Array de ints
		System.out.println(c.soma(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }));
		System.out.println(c.soma());

	}
}
