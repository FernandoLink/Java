package br.com.link.datatime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TesteDateTimeContas {
	public static void main(String[] args) {
		Instant i = Instant.now();
		System.out.println(i);
		System.out.println(i.plus(Duration.ofSeconds(10)));

		// número de segundos desde 01/01/1970 até hoje
		Instant m1 = Instant.EPOCH;
		Instant m2 = Instant.now();
		System.out.println(Duration.between(m1, m2).getSeconds());

		// ChronoUnit para unidade de tempo
		System.out.println(ChronoUnit.YEARS.between(LocalDate.of(1970, 4, 22), LocalDate.now()));
		System.out.println(ChronoUnit.MONTHS.between(LocalDate.of(1970, 4, 22), LocalDate.now()));
		System.out.println(ChronoUnit.DAYS.between(LocalDate.of(1970, 4, 22), LocalDate.now()));

		// Period para período mesmo
		System.out.println(Period.between(LocalDate.of(1970, 4, 22), LocalDate.now()).getYears());
		System.out.println(Period.between(LocalDate.of(1970, 4, 22), LocalDate.now()).getMonths());
		System.out.println(Period.between(LocalDate.of(1970, 4, 22), LocalDate.now()).getDays());

	}
}
