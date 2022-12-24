// quando não coloca o package ele é chamado de pacote padrão ou default diretório raiz do projeto
package br.com.link.estrutura.classe.java;

import java.util.*; // importa todos os métodos
import java.sql.Date; // vale o de menor escopo se tiver em dois imports o mesmo método

class /* comentário feio mas funciona */ Pessoa { // comentário de linha

	// static é uma variável que será a mesma independente da quantidade de
	// instâncias da classe
	static int totalDePessoas = 0;
	String nome;

	// construtor não devolve nada mas pode ser utilizado return; sem nada return vazio
	Pessoa(String nome) {
		if (nome == null) {
			nome = "Fernando Link";
			return;
		}
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

// nome da classe, variável, construtor e método com o mesmo nome, compila mas não é aconselhável
class B {
	int B;

	B() {
	}

	void B() {

	}
}

/*
 * comentário de várias linhas
 */
interface Figura {
	// por padrão é public static final e pode ser omitido
	int TAMANHO = 5;
	// por padrão é public abstract e pode ser omitido
	void autentica(String nome, String senha);
}

/**
 * javadoc public class só pode ter um e com o mesmo nome do arquivo.java
 */
public class TesteEstruturaClasseJava {
	public static void main(String... args) {
		System.out.println("teste estrutura classe java");
	}
}
