package br.com.bytebank.banco.modelo; 

public class ContaPoupanca extends Conta {
	public ContaPoupanca(double saldo, int agencia, int numero, String titular) {
		super(saldo, agencia, numero, titular);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}
}
