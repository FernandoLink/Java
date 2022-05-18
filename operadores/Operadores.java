package operadores;

public class Operadores {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);

        int numero = 5;
        int valor = 5 + numero++;
        System.out.println("Numero: " + Integer.toString(numero) + "\nValor: " + valor);

        int x = 4;
        x *= 2;
        System.out.println("x = " + x);

        System.out.println(Math.PI);
        System.out.println(Math.pow(5,2));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.abs(-10));
        System.out.println(Math.floor(3.9));
        System.out.println(Math.ceil(4.2));
        System.out.println(Math.round(5.6));

        double ale = Math.random();
        int n = (int) (5 + ale * (10-5));
        System.out.println(n);

        int num1, num2, res;
        num1 = 4;
        num2 = 8;
        res = (num1>num2)?0:1;
        System.out.println(res);

        int w, y, z;
        w = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (w<y ^ y==z)?true:false;
        System.out.println(r);
    }
}
