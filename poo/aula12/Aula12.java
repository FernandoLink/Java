public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        c.locomover();
        c.usarBolsar();
        c.emitirSom();

        k.locomover();
        k.emitirSom();
    }
}
