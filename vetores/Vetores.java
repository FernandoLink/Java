package vetores;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        int n[] = { 3, 2, 8, 7, 5, 1, 4 };

        for (int c = 0; c < n.length; c++) {
            System.out.println(n[c] + " ");
        }

        double v[] = { 3.2, 7.4, 6.8, 1.9 };
        for (double valor : v) {
            System.out.println(valor);
        }

        String mes[] = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };
        int tot[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int m = 0; m < mes.length; m++) {
            System.out.println(mes[m] + " tem " + tot[m] + " dias.");
        }

        Arrays.sort(mes);
        for (String valor : mes) {
            System.out.println(valor);
        }

        int f[] = new int[20];
        Arrays.fill(f, 0);
        for(int valor: f){
            System.out.print(valor);
        }

        String s = "FernandoLink";
        char[] r = new char[s.length()];
        for (int c=s.length()-1; c>=0; c--){
            r[c] = s.charAt(c);
        }
        for(char l: r){
            System.out.print(l);
        }
    }
}
