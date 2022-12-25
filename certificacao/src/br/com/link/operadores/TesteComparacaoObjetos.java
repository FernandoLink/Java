package br.com.link.operadores;

public class TesteComparacaoObjetos {
	public static void main(String[] args) {
		String nome1 = new String("Fernando");
		String nome2 = new String("Fernando");
		// == com objetos, compara a referencia se é igual
		System.out.println(nome1 == nome2);

		// aponta para o mesmo objeto criado anteriormente
		String nome3 = "Link";
		String nome4 = "Link";
		System.out.println(nome3 == nome4);

		// para ter certeza do conteúdo do objeto usar equals
		System.out.println(nome1.equals(nome2));

		String ab = "a" + "b";
		System.out.println(ab == "ab");

		String a = "a";
		String ab1 = a + "b";
		System.out.println(ab1 == "ab");

		String texto = "um texto qualquer";
		String txt = texto.substring(3, 8);
		System.out.println(txt);
		System.out.println(txt == "texto");
		System.out.println(texto.toLowerCase() == texto);
		System.out.println(texto.toString() == texto);

		String h = new String("hello "); // 2 objetos criados e 1 no pool de strings
		String h1 = "hello "; // não é criado pois foi criado na linha cima só faz referência
		String w = "world"; // mais 1 objeto criado no pool de strings
		
		System.out.println("hello "); // não é criado usa referência anterior
		System.out.println(h1 + "world"); // novo objeto mas não vai para o pool de strings
		System.out.println("Hello " == h1); // é criado no pool pois o Hello é maiúsculo
	}
}
