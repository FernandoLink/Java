package br.com.link.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Pessoa {
	String nome;
	int idade;

	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return nome;
	}
}

class FiltradorDePessoas {
	List<Pessoa> filtra(List<Pessoa> todas, Predicate<Pessoa> matcher) {
		List<Pessoa> resultado = new ArrayList<>();
		for (Pessoa p : todas) {
			if (matcher.test(p))
				resultado.add(p);
		}
		return resultado;
	}
}

public class TesteLambda {
	public static void main(String[] args) {
		List<Pessoa> pessoas = Arrays.asList(new Pessoa("Mario", 31), new Pessoa("Guilherme", 32),
				new Pessoa("Lucas", 17), new Pessoa("Alex", 15));
		
		FiltradorDePessoas filtrador = new FiltradorDePessoas();

		List<Pessoa> resultado = filtrador.filtra(pessoas, p -> p.idade >= 18);
		System.out.println(resultado);
		
		resultado = filtrador.filtra(pessoas, p -> p.idade < 18);
		System.out.println(resultado);

		resultado = filtrador.filtra(pessoas, p -> p.nome.startsWith("M"));
		System.out.println(resultado);
	}
}
