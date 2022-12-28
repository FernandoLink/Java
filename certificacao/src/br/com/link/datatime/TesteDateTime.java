package br.com.link.datatime;

// Java 8
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TesteDateTime {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(MonthDay.now());
		System.out.println(YearMonth.now());

		// fuso horário tem que escrever o zoneid corretamente
		System.out.println(LocalTime.now(ZoneId.of("America/Chicago")));
		System.out.println(LocalTime.now(ZoneId.of("America/Sao_Paulo")));

		// data específica
		System.out.println(LocalTime.of(12, 0));
		System.out.println(LocalDate.of(2014, 12, 25));
		System.out.println(LocalDate.of(2014, Month.DECEMBER, 25));
		System.out.println(LocalDateTime.of(2022, 12, 25, 12, 0));
		System.out.println(LocalDateTime.of(LocalDate.of(2014, Month.DECEMBER, 25), LocalTime.of(12, 0)));

		// extrair partes da data
		LocalDateTime ldt = LocalDateTime.of(LocalDate.of(2014, Month.DECEMBER, 25), LocalTime.of(12, 0));
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getYear());

		// outra forma
		System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
		System.out.println(ldt.get(ChronoField.DAY_OF_YEAR));
		// começa a contar na segunda
		System.out.println(ldt.get(ChronoField.DAY_OF_WEEK));
		System.out.println(ldt.get(ChronoField.CLOCK_HOUR_OF_AMPM));
		System.out.println(ldt.get(ChronoField.ERA));
		System.out.println(ldt.get(ChronoField.YEAR_OF_ERA));

		// is
		System.out.println(MonthDay.of(1, 1).isAfter(MonthDay.of(1, 2)));
		System.out.println(MonthDay.of(1, 1).isBefore(MonthDay.of(1, 2)));
		System.out.println(MonthDay.of(1, 1).equals(MonthDay.of(1, 2)));

		// os objetos date são imutáveis, utilizar with para mudar mas retorno outro
		// objeto
		System.out.println(LocalDate.of(2014, 3, 30).withMonth(12));

		// incrementar e decrementar data (plus, minus)
		System.out.println(LocalDate.of(2014, 3, 30).plusDays(5));
		System.out.println(LocalDate.of(2014, 3, 30).minusWeeks(5));
		System.out.println(LocalDate.of(2014, 3, 30).minus(4, ChronoUnit.YEARS));
		System.out.println(LocalDate.of(2014, 3, 30).plus(7, ChronoUnit.MONTHS));

	}
}
