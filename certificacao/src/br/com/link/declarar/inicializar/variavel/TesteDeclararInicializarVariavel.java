package br.com.link.declarar.inicializar.variavel;

class Motor {
}

class Carro {
	// variaveis membros tem valor padrão numéricas 0
	// boolean false
	// char é 0 pois é numérico
	// objeto é null
	// string é null
	int ano;
	char letra;
	boolean usado;
	Motor motor;
	String marca;
}

class NomesVariaveis {
	// palavras reservadas não pode ser usadas como nome de variável
	// não pode começão com zero
	// pode utilizar caracteres unicode
	// pode usar underline e $
	// pode utilizar maiúscula e minúscula
	// pode começar com alfabético, underline e $
	boolean bonitão = true;
	int ABCDE = 0;
	long ABD098 = 1;
	double $_seila = 1.0d;
	String _$seila = "link";

	int idade = 52;
	int IDADE = 52;
	int Idade = 52;

	// mas o padrão mais utilizado é começar com minúscula e ser camel case
	int minhaIdade = 52;

	@Override
	public String toString() {
		return "NomesVariaveis [bonitão=" + bonitão + ", ABCDE=" + ABCDE + ", ABD098=" + ABD098 + ", $_seila=" + $_seila
				+ ", _$seila=" + _$seila + ", idade=" + idade + ", IDADE=" + IDADE + ", Idade=" + Idade
				+ ", minhaIdade=" + minhaIdade + "]";
	}

}

class TiposPrimitivos {
	// não existe no java unsigned e signed
	byte by = 12;
	short sh = 13;
	char ch1 = 65; // char sempre positivo
	char ch2 = 'A';
	char ch3 = '\u03A9'; // Unicode
	int in = 14;
	long lo = 15l; // l ou L
	// pontos flutuantes (valores especias + ou - infinito, + ou - 0 , NaN -> not a
	// number)
	float fl = 16.1f; // f ou F
	double dou = 16.2d; // d ou D
	boolean bo = true; // boolean true ou false
	int oct = 0741;
	int hex = 0xF_F; // x ou X
	int bin = 0b1010; // b ou B
	double dnc = 3.1E2_2;
	float fnc = 3.1E2_2f;
	long great = 1_2_34__567___890__099890898l; // somente underline quando dos dois lados seja um número

	@Override
	public String toString() {
		return "TiposPrimitivos [by=" + by + ", sh=" + sh + ", ch1=" + ch1 + ", ch2=" + ch2 + ", ch3="
				+ ch3 + ", in=" + in + ", lo=" + lo + ", fl=" + fl + ", dou=" + dou + ", bo=" + bo + ", oct=" + oct
				+ ", hex=" + hex + ", bin=" + bin + ", dnc=" + dnc + ", fnc=" + fnc + ", great=" + great + "]";
	}

}

public class TesteDeclararInicializarVariavel {

	public static void main(String[] args) {
		// variaveis locais não tem valor padrão e tem que inicializar
		int idade = 10;
		System.out.println(idade);

		Carro carro = new Carro();
		System.out.println(carro.ano);
		System.out.println(carro.letra == 0);
		System.out.println(carro.usado);
		System.out.println(carro.motor);
		System.out.println(carro.marca);

		// valor padrão 0 pois é numérico
		int[] val = new int[10];
		System.out.println(val[0]);

		// valor padrão false
		boolean[] bol = new boolean[10];
		System.out.println(bol[0]);

		// valor padrão null
		String[] str = new String[10];
		System.out.println(str[0]);

		TiposPrimitivos tp = new TiposPrimitivos();
		System.out.println(tp);

		NomesVariaveis nv = new NomesVariaveis();
		System.out.println(nv);

	}

}
