package br.com.alura.alurator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Alurator {

	private String packageBase;

	public Alurator(String packageBase) {
		this.packageBase = packageBase;
	}

	public Object executa(String url) {

		String[] partesUrl = url.replaceFirst("/", "").split("/");

		String nameController = Character.toUpperCase(partesUrl[0].charAt(0)) + partesUrl[0].substring(1)
				+ "Controller";
		try {
			Class<?> classController = Class.forName(packageBase + nameController);
			Constructor<?> constructor = classController.getConstructor();
			Object instanceController = constructor.newInstance();
			System.out.println(instanceController);
			return null;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException
				| SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new RuntimeException("Erro no construtor!", e.getTargetException());
		}
	}
}
