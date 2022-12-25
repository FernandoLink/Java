package br.com.link.estrutura.condicional;

// as três partes do for são opcionais
// condição será true
// pode ter várias variáveios mas do mesmo tipo
// e vários incrementos
public class TesteFor {
	public static void main(String... args) {
		int i = 0;
		for (; i < 10;)
			System.out.println(i++);
		
		for (int j = 0; j < 10; System.out.println(j++));

		int[] numeros = { 1, 2, 3, 4, 5, 6 };
		for (int numero : numeros)
			System.out.println(numero);
	}
}
