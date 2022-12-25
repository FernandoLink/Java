package br.com.link.arrays;

// na declaração array com inicialização na mesma linha não dá para colocar o tamanho do array
// da erro de compilação
public class TesteArraysReferencia {
	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[10];

		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
			clientes[i].nome = "Link";
		}
		for (Cliente cliente : clientes)
			System.out.println(cliente.nome);

		// pode instanciar subclasses
		Cliente clientes2[] = new Cliente[5];
		clientes2[0] = new Cliente();
		clientes2[1] = new ClienteEspecial();

		Cliente link = new Cliente();
		link.nome = "Fernando ";
		System.out.println(link.nome);

		clientes2[0] = link;
		System.out.println(clientes2[0].nome);

		link.nome = "Fernando Link";
		System.out.println(link.nome);
		System.out.println(clientes2[0].nome);

		// arrays de tipos primitivos não dá para fazer casting
		// array de referencia consegue fazer o casting desde que o tipos sejam
		// compatíveis
		String[] nomes = { "Fernando", "Link" };
		Object[] objetos = nomes;

		for (Object objeto : objetos) {
			System.out.println(objeto);
		}

	}
}

class Cliente {
	String nome;
}

class ClienteEspecial extends Cliente {
}