package br.com.link.operadores;

// & executa os dois passos
// && executa o primeiro se já souber o resultado nem executa o lado da direita
public class TesteOperadoresLogicos {

	public static boolean metodo(String msg) {
		System.out.println(msg);
		return true;
	}

	public static void main(String[] args) {
		// E
		System.out.println(1 == 1 & 1 > 2);
		System.out.println(1 == 1 && 1 > 2);
		// OU
		System.out.println(1 == 1 | 1 > 2);
		System.out.println(1 == 1 || 1 > 2);
		// OU Exclusivo
		System.out.println(1 == 1 ^ 1 > 2);
		// Negação
		System.out.println(!(1 == 1));

		System.out.println(1 != 1 && metodo("primeiro"));
		System.out.println(1 != 1 && metodo("segundo"));
		System.out.println(1 == 1 || metodo("terceiro"));
		System.out.println(1 == 1 || metodo("quarto"));

	}
}
