package br.com.link.manipulando.string;

// String é imutável não muda depois de criado
public class TesteManipulandoString {
	public static void main(String[] args) {
		String nomeDireto = "Java";
		System.out.println(nomeDireto);
		
		String nomeIndireto = new String("Java");
		System.out.println(nomeIndireto);
		
		char[] nome = new char[] {'J','a','v','a'};
		System.out.println(nome);
		String nome1 = new String(nome);
		System.out.println(nome1);
		
		StringBuilder sb = new StringBuilder(nomeDireto);
		String str1 = sb.toString();
		System.out.println(str1);
		String str2 = new String(sb);
		System.out.println(str2);
		
		String nulo = null;
		System.out.println(nulo);
		
		// string null chamar toString java.lang.NullPointerException
		//System.out.println(nulo.toString());
		
		// concatenar strings
		String con1 = "Fernando " + "Link";
		System.out.println(con1);
		
		// string null concat coloca a string null
		String con2 = "Fernando " + nulo;
		System.out.println(con2);
		
		System.out.println("Fernando " + 1500);
		System.out.println("Fernando " + 1500 + 1);
		System.out.println(1500 + " Fernando");
		System.out.println(15 + (00 + " Fernando"));
		System.out.println(1 + 500 + " Fernando");
		
		// String é imutável
		String s = "Fernando Link";
		System.out.println(s.toUpperCase());
		System.out.println(s);
		
		// String um array por baixo
		System.out.println(s.charAt(9));
		
		System.out.println(s.length());
		System.out.println(!s.isEmpty());
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(9));
		System.out.println(s.concat(" Sou foda"));
		System.out.println(s.replace("Link", "Sou Foda Link"));
		System.out.println(s.replace('a', 'i'));
		System.out.println("    Fernando Link     ".trim());
		System.out.println("     ".isBlank());
		System.out.println(s.substring(4,7));
		
		String strChain = "  Fernando Link estuda porra que sou foda     ".toUpperCase().trim();
		System.out.println(strChain);
		
		System.out.println("JAVA".equals("java"));
		System.out.println("JAVA".equalsIgnoreCase("java"));
		
		System.out.println("Fernando".compareTo("Link"));
		System.out.println("Fernando".compareTo("fernando"));
		System.out.println("Fernando".compareToIgnoreCase("fernando"));
		System.out.println("Fernando".compareTo("Arnaldo"));
		
		System.out.println(strChain.indexOf("LINK"));
		System.out.println(strChain.indexOf("link"));
		System.out.println(strChain.indexOf('A'));
		System.out.println(strChain.indexOf('A',5));
		System.out.println(strChain.lastIndexOf('A'));
		System.out.println(strChain.lastIndexOf('A', 37));
		System.out.println(strChain.startsWith("FERNANDO"));
		System.out.println(strChain.startsWith("fernando"));
		System.out.println(strChain.endsWith("FODA"));
		System.out.println(strChain.endsWith("foda"));
		
		
		
	}
}
