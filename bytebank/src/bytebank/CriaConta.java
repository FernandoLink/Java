package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta(3000000.0, -1,-1, "Fernando Link");
		System.out.println(conta1);

		Conta conta2 = new Conta(1000000.0, 1, 2, "Valeria Cristina Souza Link");
		System.out.println(conta2);

		conta1.deposita(1000000);
		System.out.println(conta1);

		if (conta2.saca(1000000)) {
			System.out.println(conta2);
		} else {
			System.out.println("Saldo insuficiente " + conta2);
		}

		if (conta1.transfere(conta2, 2000000)) {
			System.out.println(conta1);
			System.out.println(conta2);
		} else {
			System.out.println("Transferencia invalida ");
		}

	}
}
