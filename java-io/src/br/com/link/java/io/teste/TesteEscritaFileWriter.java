package br.com.link.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("lorem2.txt");

		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("seila seila");

		fw.close();
	}

}
