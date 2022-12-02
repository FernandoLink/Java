package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	private static final long serialVersionUID = -724560431360415152L;

	public ContaCorrente(double saldo, int agencia, int numero, String titular) {
		super(saldo, agencia, numero, titular);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	@Override
	public String toString() {
		return "ContaCorrente " + super.toString();
	}
	
	
}

