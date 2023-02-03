package br.com.link.teste;

import java.util.Scanner;

public class Estruturas {
    private static final String ESTUDE_MAIS = "Estude mais.";

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            float n1 = teclado.nextFloat();
            float n2 = teclado.nextFloat();
            float m = (n1+n2)/2;
            System.out.println("Sua m�dia foi " + m);
            if (m>9) {
                System.out.println("Parab�ns!");
            } else {
                System.out.println(ESTUDE_MAIS);
            }
        }
        int idade = 71;
        if (idade < 16) {
            System.out.println("N�o vota!");
        } else {
            if (((idade >= 16) && (idade < 18)) || (idade > 70)) {
                System.out.println("Voto opcional!");
            } else {
                System.out.println("Voto obrigat�rio!");
            }
        }

        int pernas = 6;
        String tipo;
        switch(pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "B�pede";
                break;
            case 4:
                tipo = "Quadr�pede";
                break;
            case 6:
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}