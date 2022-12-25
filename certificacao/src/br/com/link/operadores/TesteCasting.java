package br.com.link.operadores;

public class TesteCasting {
	public static void main(String[] args) {
		double d = -15.3;
		int i = (int) d;
		System.out.println(i);
		
		// se não couber vai estourar
		long l = 151515151515l - 21191296155l;
		int i2 = (int)l;
		System.out.println(i2);
		
	}
}
