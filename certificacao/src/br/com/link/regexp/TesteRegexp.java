package br.com.link.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteRegexp {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("(\\d\\d)(\\w)");
		Matcher matcher = pattern.matcher("11a22b33b");

		while (matcher.find()) {
			System.out.printf("%s | %s | %s [%d,%d] %n", matcher.group(), matcher.group(1), matcher.group(2),
					matcher.start(), matcher.end());
		}

		String data = "2007-12-31";
		Pattern pattern1 = Pattern.compile("(\\d{4})(-)(\\d{2})(-)(\\d{2})");
		Matcher matcher1 = pattern1.matcher(data);

		if (matcher1.matches()) {

			String ano = matcher1.group(1);
			String mes = matcher1.group(3);
			String dia = matcher1.group(5);

			String separador1 = matcher1.group(2);
			String separador2 = matcher1.group(4);

			System.out.println(dia + separador1 + mes + separador2 + ano);
		}
	}

}
