package br.com.link.acesso.variaveis;

class Carro {
	String modelo;
	int ano;

	Carro() {
		// this opcional
		ano = 2014;
	}

	void reseta() {
		// this opcional
		ano = 2014;
	}

	public String getDadosDeImpressão() {
		// this é opcional
		return modelo + "::" + ano;
	}

	public void setModelo(String modelo) {
		// this não é opcional por causa do mesmo nome de variavel passado por parâmetro
		// do método
		this.modelo = modelo;
	}
}

public class TesteAcessoVariaveis {
	public static void main(String[] args) {
		Carro a = new Carro();
		a.modelo = "Palio";
		a.setModelo("Palio 2");
		System.out.println(a.getDadosDeImpressão());
		System.out.println(a.ano);
		System.out.println(a.modelo.length());
	}
}
