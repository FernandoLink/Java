package br.com.link.metodos.atributos;

// método é obrigatório falar o tipo de retorno
// modificadores de acesso vem antes do tipo de retorno
// se não coloca nada o modificador é o default
// final se o método for herdado não pode ser sobrescrito
// abstract é só a definição do método, só a assinatura do método, sem corpo
// static o método pertence a classe, não pertence ao objeto
// syncronized para threads
// native permiti implementação do método através de um código nativo JNI
// strictfp nas contas de ponta flutuante faz com que as contas sejam bem determinísticas
// após a declaração lança a exception

class Param {
	void primitivo(double a) {
		return;
	}

	void referencia(Object o) {

	}

	void teste(final int a, int b) {

	}

	String getNumero() {
		return "Nada";
	}
}

public class TestaMetodos {
	public static void main(String[] args) {
		Param p = new Param();
		int a = 1;
		p.primitivo(a);
		p.primitivo('A');
		p.referencia(new Object());
		p.referencia("Fernando Link");
		p.teste(1, 2);
	}
}
