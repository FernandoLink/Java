package br.com.link.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		//Lista lista = new Lista();
		//List<String> lista = new Vector<String>();
		List<String> lista = Collections.synchronizedList(new ArrayList<String>());

		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElemento(lista, i)).start();
		}
		Thread.sleep(2000);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(i + " - " + lista.get(i));
		}
	}

}
