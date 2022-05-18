package estruturas;

import java.util.Scanner;

public class Estruturas {
    private static final String ESTUDE_MAIS = "Estude mais.";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi " + m);
        if (m>9) {
            System.out.println("Parabéns!");
        } else {
            System.out.println(ESTUDE_MAIS);
        }

        int idade = 71;
        if (idade < 16) {
            System.out.println("Não vota!");
        } else {
            if (((idade >= 16) && (idade < 18)) || (idade > 70)) {
                System.out.println("Voto opcional!");
            } else {
                System.out.println("Voto obrigatório!");
            }
        }

        int pernas = 6;
        String tipo;
        switch(pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
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