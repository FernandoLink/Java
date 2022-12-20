package br.com.link.servidor;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class DistribuirTarefas implements Runnable {

	private Socket socket;
	private ServidorTarefas servidor;
	private ExecutorService threadPool;

	public DistribuirTarefas(ExecutorService threadPool, Socket socket, ServidorTarefas servidor) {
		this.threadPool = threadPool;
		this.socket = socket;
		this.servidor = servidor;
	}

	@Override
	public void run() {
		try {
			System.out.println("Distribuindo tarefas para " + socket);
			Scanner entradaCliente = new Scanner(socket.getInputStream());
			PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
			while (entradaCliente.hasNextLine()) {
				String comando = entradaCliente.nextLine();
				System.out.println("Comando recebido " + comando);

				switch (comando) {
					case "c1": {
						saidaCliente.println("Confirmacao comando c1");
						ComandoC1 c1 = new ComandoC1(saidaCliente);
						this.threadPool.execute(c1);
						break;
					}
					case "c2": {
						saidaCliente.println("Confirmacao comando c2");
						ComandoC2ChamaWS c2Ws = new ComandoC2ChamaWS(saidaCliente);
						ComandoC2AcessaBanco c2Banco = new ComandoC2AcessaBanco(saidaCliente);
						Future<String> futureWs = this.threadPool.submit(c2Ws);
						Future<String> futureBanco = this.threadPool.submit(c2Banco);
						this.threadPool
								.submit(new JuntaResultadosFutureWsFutureBanco(futureWs, futureBanco, saidaCliente));
						break;
					}
					case "c3": {
						saidaCliente.println("Confirmacao comando c3");
						break;
					}
					case "fim": {
						saidaCliente.println("Desligando o servidor");
						servidor.parar();
						break;
					}
					default: {
						saidaCliente.println("Comando nao encontrado");
						break;
					}
				}
				System.out.println(comando);
			}
			entradaCliente.close();
			saidaCliente.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

}
