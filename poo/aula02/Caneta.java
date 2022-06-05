package poo.aula02;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String m, String c, float p) {
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void status() {
        System.out.println();
        System.out.println("-----SOBRE A CANETA-----");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Tampada: " + this.getTampada());
        System.out.println();
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando");
        }
        System.out.println();
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}
