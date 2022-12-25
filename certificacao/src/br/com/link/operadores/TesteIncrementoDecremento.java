package br.com.link.operadores;

public class TesteIncrementoDecremento {
	public static void main(String[] args) {
		int i = 5;
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i);

		System.out.println(i += 2);
		System.out.println(i -= 2);
		System.out.println(i *= 2);
		System.out.println(i /= 2);
		System.out.println(i %= 2);

		// cuidado com os estouros, compila e executa
		byte b = 10;
		b += 200;
		System.out.println(b);

		// faz da esquerda para a direita
		int a = 10;
		a += ++a + a + ++a;
		System.out.println(a);

		int n1 = 15, n2 = 20, n3 = 30;
		n1 = n2 = n3 + 1;
		System.out.println("n1=>" + n1 + ", n2=>" + n2 + ", n3=>" + n3);
		n1 = (n2 = n3);
		System.out.println("n1=>" + n1 + ", n2=>" + n2 + ", n3=>" + n3);
		n1 = (n2 = n3) + 500000;
		System.out.println("n1=>" + n1 + ", n2=>" + n2 + ", n3=>" + n3);

	}
}
