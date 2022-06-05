package poo.aula05;

public class aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Link");
        p1.abrirConta("CC");
        p1.depositar(100);

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(5678);
        p2.setDono("Valéria");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(150);
        p1.fecharConta();

        p1.extrato();
        p2.extrato();
    }
}
