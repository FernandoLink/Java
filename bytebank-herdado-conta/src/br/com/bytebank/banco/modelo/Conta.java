package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Fernando Link
 * @version 0.1
 */
public abstract class Conta implements Comparable<Conta> {
	protected double saldo;
	private int agencia;
	private int numero;
	private String titular;
	private static int total;

	public Conta() {

	}

	/**
	 * Construtor para inicializar da classe conta
	 * 
	 * @param saldo
	 * @param agencia
	 * @param numero
	 * @param titular
	 */
	public Conta(double saldo, int agencia, int numero, String titular) {
		super();
		this.setSaldo(saldo);
		this.setAgencia(agencia);
		this.setNumero(numero);
		this.setTitular(titular);
		this.setTotal();
	}

	public abstract void deposita(double valor);

	/**
	 * Método saca
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
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

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		if (numero < 1) {
			System.out.println("Numero de conta invalida");
			return;
		}
		this.numero = numero;
	}

	public String getTitular() {
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
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;

		if (this.saldo != outra.saldo)
			return false;
		if (this.agencia != outra.agencia)
			return false;
		if (this.numero != outra.numero)
			return false;
		if (this.titular != outra.titular)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[saldo=" + this.getSaldo() + ", agencia=" + this.getAgencia() + ", numero=" + this.getNumero()
				+ ", titular=" + this.getTitular() + ", total=" + this.getTotal() + "]";
	}
	
	@Override
	public int compareTo(Conta o) {
		return Double.compare(this.saldo, o.saldo);
	}
}
