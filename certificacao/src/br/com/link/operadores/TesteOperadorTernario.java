package br.com.link.operadores;

public class TesteOperadorTernario {
	public static void main(String[] args) {
		// (condição) ? caso_verdadeira : caso_falsa
		System.out.println(5 == 5 ? "100" : 0);

		// se for atribuir o retorno tem que caber no tipo resultado
		double resultado1 = 5 == 5 ? 100:0.0;
		
		// não funciona
		//double resultado2 = 5 == 5 ? "100":0.0;
		
		// funciona
		Object resultado3 = 5 == 5 ? "100":0.0;
	}
}
