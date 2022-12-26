package br.com.link.metodos.atributos;

// não pode ter um método static e não static com o mesmo nome
class Moto {
	public static final int PADRAO_TOTAL_DE_MOTOS = 8;
	public static int totalDeMotos = PADRAO_TOTAL_DE_MOTOS;

	public static int getTotalDeMotos() {
		return Moto.totalDeMotos;
	}
}

class MotocicletaDupla extends Moto {
	// não ocorre sobrescrita, são métodos diferentes
	public static int getTotalDeMotos() {
		return -50000;
	}
}

public class TesteStatic {
	public static void main(String[] args) {
		Moto.totalDeMotos = 15;
		System.out.println(Moto.getTotalDeMotos());
		System.out.println(MotocicletaDupla.getTotalDeMotos());

		// pode chamar um método static pelo referencia do objeto
		Moto m = new Moto();
		System.out.println(m.getTotalDeMotos());
		
		m = new MotocicletaDupla();
		System.out.println(m.getTotalDeMotos());
	}
}
