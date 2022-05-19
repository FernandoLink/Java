package estruturas;

public class Repeticao {
    private static final String ESTUDE_MAIS = "Estude mais.";

    public static void main(String[] args) {
        int contador = 0;
        while (contador<4) {
            System.out.println(contador);
            contador++;
        }       

        contador = 0;
        do {
            System.out.println(contador);
            contador++;
        } while (contador<4);


        for(int i=0;i<4;i++) {
            System.out.println(i);
        }
    }
}