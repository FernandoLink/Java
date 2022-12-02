package br.com.link.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s1 = "13º Órgão Oficial";
		byte[] bytes = s1.getBytes();
		String s2 = new String(bytes, "Cp1252");
		System.out.println(s2);

		String s = "ç";
		System.out.println(s.codePointAt(0));

		Charset charset = Charset.defaultCharset();
		System.out.println(charset);

		bytes = s.getBytes(charset);
		System.out.print(bytes.length + " UTF-8, ");
		String sNovo = new String(bytes, "Cp1252");
		System.out.println(sNovo);

	}

}
