package br.com.link.teste;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o nome do aluno: ");
            float nota = 8.5f;
            String nome = teclado.nextLine();
            int idade = teclado.nextInt();
            float salario = teclado.nextFloat();
            System.out.println("A nota é " + nota);
            System.out.printf("A nota de %s é %.2f\n", nome, nota);
            System.out.format("A nota de %s é %.2f\n", nome, nota);
            System.out.println(idade);
            System.out.println(salario);
        }
    }
}
