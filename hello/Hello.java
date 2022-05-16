package hello;

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        Date relogio = new Date();
        System.out.print("A hora do sistema é ");
        System.out.println(relogio.toString());

        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.println(loc.getDisplayLanguage());

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é " + d.width + "x" + d.height);

    }
}