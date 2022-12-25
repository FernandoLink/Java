package br.com.link.operadores;

// switch pode ser de
// tipos inteiros
// string
// enums
public class TesteSwitch {
	public static void main(String[] args) {
		String opcao = "4";
		final String caso = "3";
		
		// variavel no case só se for final
		// null não pode
		// default não importa a ordem mas só roda se nenhum opção for encontrada
		switch (opcao) {
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			case "1":
				System.out.println("PRIMEIRA OPCAO");
				break;
			case "2":
				System.out.println("SEGUNDA OPCAO");
				break;
			case caso:
				System.out.println("TERCEIRA OPCAO");
				break;
			case "4":
			case "5":
				System.out.println("QUARTA E QUINTA OPCAO");
				
		}
	}
}
