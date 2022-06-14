import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer.");
        }
    }
}
