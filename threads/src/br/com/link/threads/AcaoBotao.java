package br.com.link.threads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;

	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Runnable tarefa = new TarefaMultiplicacao(primeiro, segundo, resultado);
		Thread threadCalculo = new Thread(tarefa, "Thread Calculator");
		threadCalculo.start();
		
		
		// outra forma que também funciona mas preguiçosa 
//		Multiplicador multiplicador = new Multiplicador(primeiro, segundo, resultado);
//		multiplicador.start();

	}

}