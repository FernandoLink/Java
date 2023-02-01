package br.com.alura.alurator.playground.reflexao;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import br.com.alura.alurator.playground.controle.Controle;

public class TestInstanceObject {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
            SecurityException, IllegalArgumentException, InvocationTargetException, IOException {

        Class<Controle> controleClasse1 = Controle.class;
        System.out.println(controleClasse1);
        Object objectClasse1 = controleClasse1.newInstance();
        for (String item : ((Controle) objectClasse1).getLista()) {
            System.out.println(item);
        }

        Controle controle = new Controle();
        Class<? extends Controle> controleClasse2 = controle.getClass();
        System.out.println(controleClasse2);
        Object objectClasse2 = controleClasse2.newInstance();
        for (String item : ((Controle) objectClasse2).getLista()) {
            System.out.println(item);
        }

        Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
        System.out.println(controleClasse3);
        Object objectClasse3 = controleClasse3.newInstance();
        for (String item : ((Controle) objectClasse3).getLista()) {
            System.out.println(item);
        }

    }
}
