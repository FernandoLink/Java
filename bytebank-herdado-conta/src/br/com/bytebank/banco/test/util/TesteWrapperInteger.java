package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		// int[] idades = new int[5];
		// String[] nomes = new String[5];

		// int idade = 29;
		
		// Wrapper Inicialização
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		// int valor = idadeRef.intValue(); // unboxing
		
		String s = "10";
		
		Integer numero = Integer.valueOf(s);
		int numPrimi = Integer.parseInt(s);
		
		System.out.println(numero);
		System.out.println(numPrimi);
		System.out.println(numero.doubleValue());
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef); // Autoboxing;

	}

}
