package br.com.link.estrutura.condicional;

// loop infinito com break e com código depois do loop compila
public class TesteBreakContinue {
	public static void main(String[] args) {

		int i = 0;
		while (i < 10) {
			i++;
			if (i == 5)
				break;
			System.out.println("i = " + i);
		}
		System.out.println("Fora do while => break");

		i = 0;
		while (i < 10) {
			i++;
			if (i == 5)
				continue;
			System.out.println("i = " + i);
		}
		System.out.println("Fora do while => continue");

		for (i = 0; i < 10; i++) {
			if (i == 8)
				break;
			if (i == 5)
				continue;
			System.out.println(i);
		}
		System.out.println("Fora do for => break e continue");

		// pode dar nome ao for, while e switch
		// pode dar nome a qualquer statement até comentário
		// pode inclusive dar mais nomes
		http: https: // www.link.com.br

		externo: for (i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i * j == 25)
					break externo;
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

		for (i = 0; i < 4; i++) {
			System.out.println("Estou antes do switch");
			mario: guilherme: switch (i) {
				case 0:
				case 1:
					System.out.println("Caso " + i);
					for (int j = 0; j < 3; j++) {
						System.out.println(j);
						if (j == 1)
							break mario;
					}
				case 2:
					System.out.println("Estou em i = " + i);
					continue;
				case 3:
					System.out.println("Cheguei no 3");
					break;
				default:
					System.out.println("Estranho...");
					break;
			}
			System.out.println("Estou apos o switch");

			fora: for (int a = 0; a < 30; a++)
				for (int b = 0; b < 1; b++)
					if (a + b == 25)
						continue fora;
					else if (a + b == 20)
						break;
					else
						System.out.println(a);

			int a = args.length;
			i = 0;
			switch (a) {
				case 0:
				case 1:
					for (i = 0; i < 15; i++, System.out.println(i))
						if (i == 5)
							continue;
					if (i == 15)
						break;
				case 2:
					System.out.println("2");
			}
			System.out.println("fim");
		}
	}
}
