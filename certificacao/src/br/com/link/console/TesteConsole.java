package br.com.link.console;

public class TesteConsole {

	@Override
	public String toString() {
		return "TesteConsole [" + this.getClass() + "]";
	}

	public static void main(String[] args) {
		System.out.print(1);
		System.out.println(2.0);
		System.out.println("Link");
		System.out.println('a');
		System.out.println(true);
		System.out.println(new TesteConsole());
		System.out.println(new int[] { 1, 2, 3, 4, 5 });

		// único diferente tem uma sobrecarga específica
		System.out.println(new char[] { 'a', 'b' });

		// format e printf exatamente iguais, printf é para quem veio da linguagem C
		System.out.format("Hello %s, Have a nice day!%n", "Fernando");
		System.out.format("%b%n", false);
		System.out.printf("%b%n", true);
		System.out.format("%d%n", 42);
		System.out.format("%f%n", 42.0);

		// controlar a ordem de impressão no console
		System.out.format("%2$s %1$s%n", "World", "Hello");
		System.out.format("%2$s %2$s%n", "World", "Hello");

		// imprimir tamanho
		System.out.format("[%7d]%n", 42);
		System.out.format("[%7s]%n", "link");
		System.out.format("[%7s]%n", "Fernando Link");

		// flags
		System.out.format("[%+7d]%n", 42);
		System.out.format("[%+07d]%n", 42);
		System.out.format("[%(7d]%n", 42);
		System.out.format("[%(+7d]%n", 42);
		System.out.format("[%+7d]%n", -42);
		System.out.format("[%(7d]%n", -42);
		System.out.format("[%(7d]%n", -42);

		System.out.format("[%-+7d]%n", 42);
		System.out.format("[%-(7d]%n", 42);
		System.out.format("[%-(+7d]%n", 42);
		System.out.format("[%-+7d]%n", -42);
		System.out.format("[%-(7d]%n", -42);
		System.out.format("[%-7s]%n", "Link");

		// separador de milhar do sistema operacional
		System.out.format("[%+,7.2f]%n", 42982348.99);

		System.out.printf(">%-(8.2f<%n", 12.45);
		System.out.printf(">%0,8.2f<%n", 12.45);
		System.out.format(">%1$08.2f<%n", 12.45);
		System.out.printf(">%0,(8.2f<%n", 12.45);
		System.out.format(">%0(8.2f<%n", 12.45);

		System.out.println(new char[] { 'a', 'b', 'c' }); // A
		System.out.println(new byte[] { 'a', 'b', 'c' }); // B
		System.out.println("abc"); // C
		System.out.println(new String[] { "abc" }); // D
	}
}
