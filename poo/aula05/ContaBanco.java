package poo.aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if ("CC".equals(tipo)) {
            this.setSaldo(50);
        } else if ("CP".equals(tipo)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada com dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada em débito..");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar em uma conta fechada.");
        }
    }

    public void pagarMensal() {
        float valor = 0;
        if ("CC".equals(this.getTipo())) {
            valor = 12;
        } else if ("CP".equals(this.getTipo())) {
            valor = 20;
        }
        this.setSaldo(this.getSaldo() - valor);
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso!");
            } else {
                System.out.println("Impossível pagar mensalidade, saldo insuficiente.");
            }

        }
    }

    public void extrato() {
        System.out.println("--------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }
}
