package br.com.link.teste;

public class Encadeamento {
	private int numero;

	public Encadeamento adicionar(int valor) {
		numero += valor;
		return this;
	}

	public Encadeamento subtrair(int valor) {
		numero -= valor;
		return this;
	}

	public Encadeamento multiplicar(int valor) {
		numero *= valor;
		return this;
	}

	public int obterResultado() {
		return numero;
	}

	public static void main(String[] args) {
		Encadeamento objeto = new Encadeamento();
		objeto.adicionar(10).subtrair(5).multiplicar(2);
		System.out.println("Resultado: " + objeto.obterResultado());
	}
}
