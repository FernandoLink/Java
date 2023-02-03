package br.com.link.manipulando.string;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Fernando Link";
        String nome2 = new String("Fernando Link");
        String res;
        res = (nome1.equals(nome2))?"igual":"diferente";
        System.out.println(res);
    }
}