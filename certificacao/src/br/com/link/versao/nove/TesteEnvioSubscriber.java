package br.com.link.versao.nove;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

import br.com.link.versao.nove.model.NotaFiscal;
import br.com.link.versao.nove.subscriber.NotaFiscalSubscriber;

public class TesteEnvioSubscriber {

	public static void main(String[] args) {

		NotaFiscal primeiraNotaFiscal = new NotaFiscal("João", 19.99, LocalDate.now());
		NotaFiscal segundaNotaFiscal = new NotaFiscal("Pedro", 29.99, LocalDate.now());
		NotaFiscal terceiraNotaFiscal = new NotaFiscal("Maria", 39.99, LocalDate.now());

		SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
		NotaFiscalSubscriber subscriber = new NotaFiscalSubscriber();
		publisher.subscribe(subscriber);
		publisher.submit(primeiraNotaFiscal);
		publisher.submit(segundaNotaFiscal);
		publisher.submit(terceiraNotaFiscal);
		System.out.println("Você irá receber a nota fiscal no seu e-mail");

		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.close();

		publisher.close();
	}
}
