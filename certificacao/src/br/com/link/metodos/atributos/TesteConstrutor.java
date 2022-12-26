package br.com.link.metodos.atributos;

// sem construtor, criar um construtor padrão vazio
// chama o construtor padrão do Object
// se a classe é public o construtor padrão também é public
// no momento que você cria um construtor, o construtor padrão já era
// a inicialização das variáveis ocorre antes do construtor
class A {
	int i = 5;
	String nome = "";
	int tamanho = tamanhoDoNome();

	A() {
		System.out.println(i);
	}
	
	int tamanhoDoNome() {
		return nome.length();
	}

	A(String nome) {
		System.out.println(this.nome);
		this.nome = nome;
		System.out.println(this.nome);
		System.out.println(i);
	}
}

public class TesteConstrutor {
	public static void main(String[] args) {
		A a = new A();
		a = new A("Link");
		System.out.println(a.i);
	}
}
