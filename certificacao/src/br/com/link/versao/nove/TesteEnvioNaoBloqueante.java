package br.com.link.versao.nove;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;

import br.com.link.versao.nove.model.NotaFiscal;
import br.com.link.versao.nove.wsclient.NotaFiscalWSClient;

public class TesteEnvioNaoBloqueante {

	public static void main(String[] args) {

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);

		System.out.println("A thread do TesteEnvioNaoBloqueante �: " + Thread.currentThread().getName());

		NotaFiscal primeiraNotaFiscal = new NotaFiscal("Jo�o", 39.99, LocalDate.now());
		SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>(newFixedThreadPool, 1);
		NotaFiscalWSClient nfwsc = new NotaFiscalWSClient();
		publisher.consume(nfwsc::enviar);
		publisher.consume(data -> {
			System.out.println("Outra thread: " + Thread.currentThread().getName());
		});
		publisher.submit(primeiraNotaFiscal);
		System.out.println("Voc� ir� receber a nota fiscal no seu e-mail");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.close();
		publisher.close();
	}
}
