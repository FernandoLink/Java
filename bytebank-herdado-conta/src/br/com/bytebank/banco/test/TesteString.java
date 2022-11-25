package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
	
		String nome = "Alura"; // Object literal
		String outro = new String("Funciona mas eh ma pratica");
		
		System.out.println(nome.toUpperCase());
		
		nome.replace(nome, outro);
		System.out.println(outro.toLowerCase());
		
		System.out.println(nome.replace('A', 'a'));
		System.out.println(nome.replace("Alu", "aLU"));
		
		System.out.println(nome.charAt(2));
		System.out.println(nome.indexOf('u'));
		System.out.println(nome.indexOf("ra"));
		
		System.out.println(nome.substring(1));
		System.out.println(nome.length());
		
		String vazia = " ";
		System.out.println(vazia.isBlank());
		System.out.println(vazia.isEmpty());
		
		String vazia1 = vazia.trim();
		System.out.println(vazia1.isEmpty());
		
		System.out.println(nome.contains("Alu"));
		
		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto); 
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto1 = builder.toString();
		System.out.println(texto1);
		
		String nome1 = "ALURA";
		CharSequence cs = new StringBuilder("al");
		nome1 = nome1.replace("AL", cs);
		System.out.println(nome1);
		
	}
}
