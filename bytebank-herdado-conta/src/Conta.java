
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

	public boolean saca(double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
	}

	public boolean transfere(Conta conta, double valor) {
		if (this.saca(valor)) {
			conta.deposita(valor);
			return true;
		}
		return false;
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
