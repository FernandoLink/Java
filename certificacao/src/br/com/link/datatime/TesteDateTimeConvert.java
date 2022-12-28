package br.com.link.datatime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class TesteDateTimeConvert {
	public static void main(String[] args) {
		// datetime => date ou time
		System.out.println(LocalDateTime.now().toLocalDate());
		System.out.println(LocalDateTime.now().toLocalTime());
		
		// date time => datetime
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		LocalDate ld = ldt.toLocalDate();
		System.out.println(ld);
		LocalTime lt = ldt.toLocalTime();
		System.out.println(lt);
		
		LocalDateTime ldt2 = ld.atTime(lt);
		System.out.println(ldt2);
		LocalDateTime ldt3 = lt.atDate(ld);
		System.out.println(ldt3);
		
		// como integrar api nova com a api antiga Date Calendar
		Date d = new Date();
		// instante em milisegundos desde 01/01/1970
		Instant i = d.toInstant();
		LocalDateTime ldt4 = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
		
		Calendar c = Calendar.getInstance();
		// instante em milisegundos desde 01/01/1970
		Instant j = c.toInstant();
		LocalDateTime ldt5 = LocalDateTime.ofInstant(j, ZoneId.systemDefault());
		
		Instant it = ldt5.toInstant(ZoneOffset.UTC);
		System.out.println(it);
		Date d2 = Date.from(it);
		System.out.println(d2);
		Calendar c2 = Calendar.getInstance();
		System.out.println(c2);
		c2.setTime(d2);
		System.out.println(c2);
		
	}
}
