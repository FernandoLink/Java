package br.com.alura.banheiro;

public class Banheiro {

	private boolean ehSujo = true;

	public void fazNumero1() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " batendo na porta");
		synchronized (this) {
			System.out.println(nome + " Entrando no banheiro");

			while (ehSujo) {
				esperaLaFora(nome);
			}
			System.out.println(nome + " Fazendo coisa rapida");
			dormeUmPouco(5000);
			this.ehSujo = true;
			System.out.println(nome + " Dando descarga");
			System.out.println(nome + " Lavando mao");
			System.out.println(nome + " Saindo banheiro");
		}
	}

	private void esperaLaFora(String nome) {
		System.out.println(nome + ", eca, banheiro ta sujo");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void limpa() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " batendo na porta");
		synchronized (this) {
			System.out.println(nome + " Entrando no banheiro");

			if (!ehSujo) {
				System.out.println(nome + ", nao esta sujo, vou sair");
			}

			System.out.println(nome + " limpando banheiro");
			this.ehSujo = false;
			dormeUmPouco(1300);
			System.out.println(nome + " Dando descarga");
			System.out.println(nome + " Lavando mao");
			System.out.println(nome + " Saindo banheiro");
			this.ehSujo = false;
			this.notifyAll();
		}
	}

	private void dormeUmPouco(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void fazNumero2() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " batendo na porta");
		synchronized (this) {
			System.out.println(nome + " Entrando no banheiro");
			while (ehSujo) {
				esperaLaFora(nome);
			}
			System.out.println(nome + " Fazendo coisa demorada");
			dormeUmPouco(10000);
			this.ehSujo = true;
			System.out.println(nome + " Dando descarga");
			System.out.println(nome + " Lavando mao");
			System.out.println(nome + " Saindo banheiro");
		}
	}
}
