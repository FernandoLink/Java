package br.com.link.lista;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		Lista lista = new Lista();
		// List<String> lista = new Vector<String>();
		// List<String> lista = Collections.synchronizedList(new ArrayList<String>());

		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElemento(lista, i)).start();
		}

		new Thread(new TarefaImprimir(lista)).start();

	}

}
