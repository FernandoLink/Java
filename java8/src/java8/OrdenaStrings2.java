package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings2 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);
		
		// equivalente acima para entender melhor
		Function<String, Integer> funcao = new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		// Method reference
		palavras.sort(Comparator.comparing(String::length));
		
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);
		
		palavras.forEach(System.out::println);

		// equivalente acima
		palavras.forEach(s -> System.out.println(s));
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		

	}
}
