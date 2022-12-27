package br.com.link.polimorfismo;

class Conta {
	int id;
}

class ContaJuridica extends Conta {
	String cnpj;
}

public class TesteReferenciaObjeto {
	public static void main(String[] args) {
		Conta c = new ContaJuridica();
		c.id = 15;
		//c.cpnj = "816.289.279-68";
	}
}
