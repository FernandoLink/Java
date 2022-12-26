package br.com.link.heranca;

// classe final não pode ser herdada
class Mae {

}

// Não é permitido herança múltipla
class Filha extends Mae {

}

class Neta extends Filha {

}

class X {
	protected int x;

	protected void y() {
		System.out.println("Invocando y em um objeto");
	}
}

class Y extends X {

}

class W {
	public static void metodo() {
		System.out.println("Invocando um metodo estatico que foi definido em W");
	}
}

class Z extends W {
	public static void metodo() {
		System.out.println("Invocando um metodo estatico que foi definido em Z");
	}

}

class Gato {
	String corDosOlhos;
	public String toString() {
		return "[Gato com olho " + corDosOlhos + "]"; 
	}
}

public class TesteHeranca {
	public static void main(String[] args) {
		Y y = new Y();
		y.x = 15;
		y.y();

		W.metodo();
		Z.metodo();
		
		Z z = new Z();
		z.metodo();
		
		W w = new W();
		w.metodo();
		
		w = new Z();
		w.metodo();
		
		Gato g = new Gato();
		g.corDosOlhos = "verde";
		System.out.println(g);
	}
}
