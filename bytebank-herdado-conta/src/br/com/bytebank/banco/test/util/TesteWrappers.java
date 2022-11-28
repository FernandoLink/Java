package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.intValue());
		
		Double dRef = Double.valueOf(3.2); // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bRef = Boolean.FALSE; 
		System.out.println(bRef.booleanValue());
		
		Number refNum = Integer.valueOf(28);
		System.out.println(refNum);
		
		refNum = Double.valueOf(36.0);
		System.out.println(refNum);
		
		List<Number> lista = new ArrayList<>();
		
		lista.add(10);
		lista.add(32.8);
		lista.add(25.6f);
		
		for(Number num: lista) {
			System.out.println(num);
		}
		
	}
}
