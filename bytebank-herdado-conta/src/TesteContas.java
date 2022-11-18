
public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100, 111, 111, "Fernando Link");

		ContaPoupanca cp = new ContaPoupanca(200, 222, 222, "Valeria Cristina Souza Link");

		cc.transfere(cp, 10.0);

		System.out.println(cc);
		System.out.println(cp);

	}

}
