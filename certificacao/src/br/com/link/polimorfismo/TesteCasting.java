package br.com.link.polimorfismo;

public class TesteCasting {
	public static void main(String[] args) {
		Object[] o = new Object[100];
		String s = "certiticacao";
		o[0] = s;

		String recuperada = (String) o[0];
		System.out.println(recuperada);

		// cast é opcional de for do mais específico para o mais genérico
		// mas o contrário é obrigatório
		String nome1 = (String) "Fernando Link";
		String nome2 = nome1;
		Object nome3 = nome2;
		Object nome4 = (String) nome3;
		Object nome5 = (Object) nome4;
		System.out.println(nome1);
		System.out.println(nome2);
		System.out.println(nome3);
		System.out.println(nome4);
		System.out.println(nome5);
	}
}
