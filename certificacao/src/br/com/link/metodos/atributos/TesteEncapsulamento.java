package br.com.link.metodos.atributos;

class Pessoa {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

public class TesteEncapsulamento {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Fernando Link");
		System.out.println(p.getNome());
	}
}