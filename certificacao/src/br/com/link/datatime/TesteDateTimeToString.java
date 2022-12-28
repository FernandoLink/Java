package br.com.link.datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TesteDateTimeToString {
	public static void main(String[] args) {
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// duas formas de formatar
		System.out.println(formatter.format(agora));
		System.out.println(agora.format(formatter));
		
		// String to DateTime
		System.out.println(LocalDate.parse("22/04/1970", formatter));
	}
}
