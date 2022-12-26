package br.com.link.metodos.atributos;

// sobrecarga é quando os tipos de parâmetros ou a quantidade são diferentes
// o que está antes do nome do método não influencia, se for o mesmo nome dá erro na compilação
class Overloader {
	public void metodo(int a) {
		System.out.println("com parametro int => " + a);
	}

	public void metodo(double a) {
		System.out.println("com parametro double => " + a);
	}

	public void metodo() {
		System.out.println("sem parametro");
	}

	public void metodo2(String s) {
		System.out.println("String => " + s);
	}

	public void metodo2(Object o) {
		System.out.println("Object => " + o);

	}

	public void metodo3(String a, int i) {
		System.out.println("String, int");
	}

	public void metodo3(int i, String s) {
		System.out.println("int, String");
	}

	public void metodo4(int i, double d) {
		System.out.println("int, double");
	}

	public void metodo4(double d, int i) {
		System.out.println("double, int");
	}

	public void metodo5(String s, Object o) {
		System.out.println("String, Object");
	}

	public void metodo5(Object o, String s) {
		System.out.println("Object, String");
	}

	public void metodo6(String s1, String s2) {
		System.out.println("String, String");
	}

	public void metodo6(Object o1, Object o2) {
		System.out.println("Object, Object");
	}
}

public class TesteOverload {
	public static void main(String[] args) {
		new Overloader().metodo();
		new Overloader().metodo(1);
		new Overloader().metodo((short) 2);
		new Overloader().metodo(1.2);
		new Overloader().metodo((float) 1.2);

		new Overloader().metodo2("Fernando Link");
		new Overloader().metodo2((Object) "Fernando Link");
		new Overloader().metodo2(new Object());

		new Overloader().metodo3("Fernando Link", 1);
		new Overloader().metodo3(1, "Fernando Link");

		new Overloader().metodo4(3, 5.2);
		new Overloader().metodo4(5.2, 3);

		new Overloader().metodo5("Link", new Object());
		new Overloader().metodo5(new Object(), "Link");

		new Overloader().metodo6("Fernando", "Link");
		new Overloader().metodo6(new Object(), new Object());
		new Overloader().metodo6(new Object(), "Link");
	}
}
