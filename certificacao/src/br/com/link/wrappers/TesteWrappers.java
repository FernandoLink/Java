package br.com.link.wrappers;

public class TesteWrappers {
	public static void main(String[] args) {
		Double d1 = Double.valueOf(22.5);
		System.out.println(d1);
		Double d2 = Double.valueOf("22.6");
		System.out.println(d2);

		Character c = Character.valueOf('a');
		System.out.println(c);

		Boolean b1 = Boolean.valueOf(true);
		System.out.println(b1);
		Boolean b2 = Boolean.valueOf("TrUe");
		System.out.println(b2);
		Boolean b3 = Boolean.valueOf("FaLsEeeee");
		System.out.println(b3);
		Boolean b4 = Boolean.valueOf("True ");
		System.out.println(b4);

		// wrapper => primitivo
		// xxxValue
		Long l = Long.valueOf("123");
		System.out.println(l);
		long l1 = l.longValue();
		System.out.println(l1);
		int i = (int) l.longValue();
		System.out.println(i);
		double d = l.doubleValue();
		System.out.println(d);

		boolean b = Boolean.valueOf("True").booleanValue();
		System.out.println(b);

		char c1 = Character.valueOf('a').charValue();
		System.out.println(c1);

		// String => primitivo
		// parseXxx
		double d3 = Double.parseDouble("123.6");
		System.out.println(d3);
		int i1 = Integer.parseInt("123123");
		System.out.println(i1);

		// base octal, hexadecimal, binária
		int i2 = Integer.parseInt("16", 10);
		System.out.println(i2);
		i2 = Integer.parseInt("16", 16);
		System.out.println(i2);
		i2 = Integer.parseInt("A", 16);
		System.out.println(i2);
		l = Long.parseLong("11", 2);
		System.out.println(i2);
		l = Long.parseLong("16", 8);

		// String => wrapper
		// valueOf
		Double d4 = Double.valueOf("23.7");
		System.out.println(d4);
		Integer i3 = Integer.valueOf("5AF", 16);
		System.out.println(i3);

		// primitivo -> String
		// toString
		String s = Double.toString(24.6);
		System.out.println(s);
		s = Integer.toString(123, 10);
		System.out.println(s);

		// wrapper => String
		// toString
		String x = Integer.toString(11, 16);
		System.out.println(x);

		// wrapper => char
		Integer integer = 65;
		char c2 = (char) integer.intValue();
		System.out.println(c2);

		// Character => char
		char c3 = Character.valueOf('x').charValue();
		System.out.println(c3);

	}
}
