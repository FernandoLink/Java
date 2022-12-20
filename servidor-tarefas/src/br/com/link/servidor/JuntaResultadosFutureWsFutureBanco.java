package br.com.link.servidor;

import java.io.PrintStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class JuntaResultadosFutureWsFutureBanco implements Callable<Void> {

	private Future<String> futureWs;
	private Future<String> futureBanco;
	private PrintStream saidaCliente;

	public JuntaResultadosFutureWsFutureBanco(Future<String> futureWs, Future<String> futureBanco,
			PrintStream saidaCliente) {
		this.futureWs = futureWs;
		this.futureBanco = futureBanco;
		this.saidaCliente = saidaCliente;
	}

	@Override
	public Void call() {
		System.out.println("Aguardando resultados do future WS e Banco");
		try {
			String numeroMagico = futureWs.get(20, TimeUnit.SECONDS);
			String numeroMagico2 = futureBanco.get(20, TimeUnit.SECONDS);

			this.saidaCliente.println("Resultado comando c2 : " + numeroMagico + ", " + numeroMagico2);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			System.out.println("Timeout: Cancelando execucao do comando c2");
			this.saidaCliente.println("Timeout na Execucao do comando c2");
			this.futureWs.cancel(true);
			this.futureBanco.cancel(true);
		}

		System.out.println("Finalizou JuntaResultadosFutureWsFutureBanco");
		return null;
	}

}
