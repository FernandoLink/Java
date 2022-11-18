
public class ContaCorrente extends Conta {
	public ContaCorrente(double saldo, int agencia, int numero, String titular) {
		super(saldo, agencia, numero, titular);
	}

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}
}
