package br.com.link.ciclo.vida.objeto;

class Carro {
	int ano;
}

// não tem como saber quando a JVM (garbage collector) 
// vai liberar os objetos inacessíveis
public class TesteCicloVidaObjeto {
	public static void main(String[] args) {
		// para criar o carro precisa chamar o construtor, precisa chamar o new
		// um objeto criado
		Carro c = new Carro();

		// dois objetos criados
		new Carro();

		// a partir do ponto abaixo não existe mais objeto carro acessível
		c = null;

		// o primeiro c new Carro não está mais acessível o garbage collector pode
		// encerrar
		c = new Carro();

		// depois do if o carro não está mais acessível
		if (15 > 10) {
			Carro c2 = new Carro();
			c2.ano = 2010;
		}

		// depois do for somente um carro é acessível, o último carro criado
		Carro c3;
		for (int i = 0; i < 10; i++) {
			c3 = new Carro();
		}

		// fim do programa libera tudo
	}

}
