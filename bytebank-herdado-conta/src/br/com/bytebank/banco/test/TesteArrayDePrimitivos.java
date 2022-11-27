package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		// int idades[] também é válido
		// já inicializa com 0
		int[] idades = new int[5];
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int idade : idades) {
			System.out.println(idade);
		}
		System.out.println("Tamanho do array: " + idades.length);
	}
}
