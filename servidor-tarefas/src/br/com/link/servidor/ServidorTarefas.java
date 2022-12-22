package br.com.link.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class ServidorTarefas {

	private ServerSocket servidor;
	private ExecutorService threadPool;
	private AtomicBoolean estaRodando;
	private BlockingQueue<String> filaComandos;

	public ServidorTarefas() throws IOException {
		System.out.println("--- Iniciando servidor ---");
		this.servidor = new ServerSocket(12345);
		this.threadPool = Executors.newCachedThreadPool(new FabricadDeThreadas());
//		this.threadPool = Executors.newFixedThreadPool(4, new FabricadDeThreadas());
		this.estaRodando = new AtomicBoolean(true);
		this.filaComandos = new ArrayBlockingQueue<>(2);
		iniciarConsumidores();
	}

	private void iniciarConsumidores() {
		int qtaConsumidores = 2;
		for (int i = 0; i < qtaConsumidores; i++) {
			TarefaConsumir tarefa = new TarefaConsumir(filaComandos);
			this.threadPool.execute(tarefa);
		}
	}

	public void parar() throws IOException {
		this.estaRodando.set(false);
		servidor.close();
		threadPool.shutdown();
//		System.exit(0);
	}

	public void rodar() throws IOException {
		while (this.estaRodando.get()) {
			try {
				Socket socket = servidor.accept();
				System.out.println("Aceitando novo cliente na porta " + socket.getPort());
				DistribuirTarefas distribuirTarefas = new DistribuirTarefas(threadPool, filaComandos, socket, this);
				threadPool.execute(distribuirTarefas);
			} catch (SocketException e) {
				System.out.println("SocketException, Esta rodando? " + this.estaRodando);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		ServidorTarefas servidor = new ServidorTarefas();
		servidor.rodar();
		servidor.parar();
	}
}
