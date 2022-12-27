package br.com.link.polimorfismo;

/*
 * modificadores da filha tem que ser igual ou maior do que o pai
 * as exceptions mesma regra dos modificadores de acesso
*/
class Veiculo {
	public void liga() {
		System.out.println("O veiculo esta sendo ligado");
	}
}

class Helicoptero extends Veiculo {
	public void liga() {
		System.out.println("Ligando o helicoptero");
	}

}

// pode criar uma classe abstract que a pai não é abstract
abstract class Droid extends Veiculo {
	public abstract void liga();
}

class HexaDroid extends Droid {
	public void liga() {
		System.out.println("hexa");
	}
}

class FabricaDeVeiculo {
	Veiculo fabrica() {
		return new Veiculo();
	}
}

class FabricaDeHexaDroid extends FabricaDeVeiculo {
	HexaDroid fabrica() {
		return new HexaDroid();
	}
}

// todo método de interface é public
interface A {
	void x();
}

// toda class sem método de acesso é default
// tem que ser public 
class B implements A {
	public void x() {

	}
}

public class TestePolimorfismo {

	// método polimorfico
	static void metodo(Veiculo v) {
		v.liga();
	}

	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		v.liga();
		Helicoptero h = new Helicoptero();
		h.liga();
		Veiculo vh = new Helicoptero();
		vh.liga();
		HexaDroid hd = new FabricaDeHexaDroid().fabrica();
		hd.liga();

		metodo(new HexaDroid());
		metodo(new Veiculo());
		metodo(new Helicoptero());
		
		System.out.println(hd instanceof Veiculo);
		System.out.println(vh instanceof Helicoptero);
	}
}
