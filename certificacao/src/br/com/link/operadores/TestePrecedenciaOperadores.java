package br.com.link.operadores;

public class TestePrecedenciaOperadores {
	public static void main(String[] args) {
		int a = 15 * 4 + 1;
		System.out.println(a);

		int b = 15 * (4 + 1);
		System.out.println(b);

		System.out.println(15 + (0 + " eh cento e cinquenta"));
		System.out.println("Fernando" + " Link".length());
		System.out.println(("Fernando" + " Link").length());
		
		System.out.println(((!(true==false))==true ? 1 : 0)==0);
	}
}
