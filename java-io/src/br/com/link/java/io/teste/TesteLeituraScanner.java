package br.com.link.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), "Cp1252");

		while (scanner.hasNext()) {
			String linha = scanner.nextLine();
//			String valores[] = linha.split(",");
//			System.out.println(Arrays.toString(valores));

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();

			System.out.format(new Locale("pt", "BR"),
					"Tipo de Conta: %s - Agencia-Conta: %04d-%05d - Titular: %-12s - Saldo: R$ %8.2f %n", valor1, valor2,
					valor3, valor4, valor5);

			linhaScanner.close();

		}
		scanner.close();
	}

}
