package br.com.link.linkbank;

import java.util.Scanner;

import br.com.link.linkbank.domain.RegraDeNegocioException;
import br.com.link.linkbank.domain.cliente.DadosCadastroCliente;
import br.com.link.linkbank.domain.conta.ContaService;
import br.com.link.linkbank.domain.conta.DadosAberturaConta;

public class LinkbankApplication {

	private static ContaService service = new ContaService();
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		var opcao = exibirMenu();
		while (opcao != 7) {
			try {
				switch (opcao) {
					case 1:
						listarContas();
						break;
					case 2:
						abrirConta();
						break;
					case 3:
						encerrarConta();
						break;
					case 4:
						consultarSaldo();
						break;
					case 5:
						realizarSaque();
						break;
					case 6:
						realizarDeposito();
						break;
				}
			} catch (RegraDeNegocioException e) {
				System.out.println("Erro: " + e.getMessage());
				System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu");
				teclado.next();
			}
			opcao = exibirMenu();
		}

		System.out.println("Finalizando a aplica��o.");
	}

	private static int exibirMenu() {
		System.out.println("""
				LINKBANK - ESCOLHA UMA OP��O:
				1 - Listar contas abertas
				2 - Abertura de conta
				3 - Encerramento de conta
				4 - Consultar saldo de uma conta
				5 - Realizar saque em uma conta
				6 - Realizar dep�sito em uma conta
				7 - Sair
				""");
		return teclado.nextInt();
	}

	private static void listarContas() {
		System.out.println("Contas cadastradas:");
		var contas = service.listarContasAbertas();
		contas.stream().forEach(System.out::println);

		System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
		teclado.next();
	}

	private static void abrirConta() {
		System.out.println("Digite o n�mero da conta:");
		var numeroDaConta = teclado.nextInt();

		System.out.println("Digite o nome do cliente:");
		var nome = teclado.next();

		System.out.println("Digite o cpf do cliente:");
		var cpf = teclado.next();

		System.out.println("Digite o email do cliente:");
		var email = teclado.next();

		service.abrir(new DadosAberturaConta(numeroDaConta, new DadosCadastroCliente(nome, cpf, email)));

		System.out.println("Conta aberta com sucesso!");
		System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
		teclado.next();
	}

	private static void encerrarConta() {
		System.out.println("Digite o n�mero da conta:");
		var numeroDaConta = teclado.nextInt();

		service.encerrar(numeroDaConta);

		System.out.println("Conta encerrada com sucesso!");
		System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
		teclado.next();
	}

	private static void consultarSaldo() {
		System.out.println("Digite o n�mero da conta:");
		var numeroDaConta = teclado.nextInt();
		var saldo = service.consultarSaldo(numeroDaConta);
		System.out.println("Saldo da conta: " + saldo);

		System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
		teclado.next();
	}

	private static void realizarSaque() {
		System.out.println("Digite o n�mero da conta:");
		var numeroDaConta = teclado.nextInt();

		System.out.println("Digite o valor do saque:");
		var valor = teclado.nextBigDecimal();

		service.realizarSaque(numeroDaConta, valor);
		System.out.println("Saque realizado com sucesso!");
		System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
		teclado.next();
	}

	private static void realizarDeposito() {
		System.out.println("Digite o n�mero da conta:");
		var numeroDaConta = teclado.nextInt();

		System.out.println("Digite o valor do dep�sito:");
		var valor = teclado.nextBigDecimal();

		service.realizarDeposito(numeroDaConta, valor);

		System.out.println("Dep�sito realizado com sucesso!");
		System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
		teclado.next();
	}
}