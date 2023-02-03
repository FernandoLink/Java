package br.com.link.acesso.variaveis;

public class ConversaoTipos {
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        System.out.println(idade);

        String valor2 = "40";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(valor2);
        System.out.println(idade2);

        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.println(valor3);
        System.out.println(idade3);
    }
}
