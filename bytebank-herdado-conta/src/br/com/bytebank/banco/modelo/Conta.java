package br.com.bytebank.banco.modelo;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private String titular;
	private static int total;

	public Conta() {

	}

	public Conta(double saldo, int agencia, int numero, String titular) {
		super();
		this.setSaldo(saldo);
		this.setAgencia(agencia);
		this.setNumero(numero);
		this.setTitular(titular);
		this.setTotal();
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.getSaldo() < valor) {
			throw new SaldoInsuficienteException("Saldo " + this.getSaldo() + ", Valor = " + valor);
		}
		this.setSaldo(this.getSaldo() - valor);
	}

	public void transfere(Conta conta, double valor) throws SaldoInsuficienteException {
		this.saca(valor);
		conta.deposita(valor);
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private int getAgencia() {
		return agencia;
	}

	private void setAgencia(int agencia) {
		if (agencia < 1) {
			System.out.println("Numero de agencia invalida");
			return;
		}
		this.agencia = agencia;
	}

	private int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		if (numero < 1) {
			System.out.println("Numero de conta invalida");
			return;
		}
		this.numero = numero;
	}

	private String getTitular() {
		return titular;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		Conta.total++;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + this.getSaldo() + ", agencia=" + this.getAgencia() + ", numero=" + this.getNumero()
				+ ", titular=" + this.getTitular() + ", total=" + this.getTotal() + "]";
	}
}
