package br.com.link.escopo.variaveis;

public class TesteEscopoVariaveis {

	String nome = "Fernando";
	String nomeCompleto = nome + " Link";

	public TesteEscopoVariaveis(String nome) {
		System.out.println(this.nome);
		System.out.println(nome);
		m2(nome);
		System.out.println(nomeCompleto);
	}

	public void m1() {
		int x = 10;
		if (x >= 10) {
			int y = 50;
			System.out.println(y);
		}
		System.out.println(x);
	}

	public void m2(String nome) {
		System.out.println(nome);
	}

	public static void main(String... args) {
		TesteEscopoVariaveis t = new TesteEscopoVariaveis("Fernando");
		t.m1();
		t.m2("Link");
		t.nome = "Fernando Sou Foda Link";

		Pessoa p = new Pessoa();
		System.out.println(p.id);
		System.out.println(Pessoa.id);
		Pessoa.id++;
		System.out.println(p.id);
		System.out.println(Pessoa.id);
		Pessoa.metodo();
	}

}

class Pessoa {
	static int id = 1;

	static void metodo() {
		System.out.println(id);
	}
}