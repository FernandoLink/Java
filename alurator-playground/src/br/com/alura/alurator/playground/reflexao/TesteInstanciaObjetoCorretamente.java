package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.alura.alurator.playground.controle.SubControle;

public class TesteInstanciaObjetoCorretamente {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		// Construtores Públicos
		Class<SubControle> subControleClasse1 = SubControle.class;
		Constructor<SubControle> construtorSubControle1 = subControleClasse1.getConstructor();
		System.out.println(construtorSubControle1);
		SubControle subcontrole1 = construtorSubControle1.newInstance();
		System.out.println(subcontrole1);

		// Construtores Privados
		Constructor<SubControle> construtorSubControle2 = subControleClasse1.getDeclaredConstructor(String.class);
		System.out.println(construtorSubControle2);
		construtorSubControle2.setAccessible(true);
		SubControle subcontrole2 = construtorSubControle2.newInstance("Seila");
		System.out.println(subcontrole2);
	}

}
