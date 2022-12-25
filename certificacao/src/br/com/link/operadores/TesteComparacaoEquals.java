package br.com.link.operadores;

class Cliente {
	String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	// para sobrescrever tem que ser igual a classe mãe
	// se trocar Object para Cliente vai funcionar
	// não está sobrescrevendo e sim sobrecarregando
	public boolean equals(Object o) {
		Cliente outro = (Cliente) o;
		return this.nome.equals(outro.nome);
	}
}

public class TesteComparacaoEquals {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Mario");
		Cliente c2 = new Cliente("Guilherme");
		Cliente c3 = new Cliente("Guilherme");

		System.out.println(c1 == c2);
		System.out.println(c1 == c1);
		// Objetos diferentes == verifica se são a mesma referência
		System.out.println(c2 == c3);

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c1));
		System.out.println(c2.equals(c3));

		
        String s1 = "s1";
        String s2 = s1.substring(0, 2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
	}
}
