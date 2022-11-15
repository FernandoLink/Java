package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta conta1 = new Conta(1000000.0, 1, 3, "Luiza Souza Link");
		System.out.println(conta1);

		Conta conta2 = conta1;
		System.out.println(conta2);

		conta1.setSaldo(9000000.0);
		System.out.println(conta1);
		System.out.println(conta2);

		System.out.println(Conta.class);

		if (conta1 == conta2) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}

	}
}
