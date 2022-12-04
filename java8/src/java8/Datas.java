package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		System.out.println(LocalDate.of(2023, Month.JUNE, 5).getYear() - LocalDate.now().getYear());
		
		System.out.println(Period.between(LocalDate.now(), LocalDate.of(2023, Month.JUNE, 5)).getDays());

		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
		
		System.out.println(LocalTime.of(15, 30));
		
		System.out.println(ZonedDateTime.now());
	}
}
