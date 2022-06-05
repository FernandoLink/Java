package poo.aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC cristal", "Vermelha", 0.5f);
        c1.setCarga(80);
        c1.status();
        c1.rabiscar();
    }
}
