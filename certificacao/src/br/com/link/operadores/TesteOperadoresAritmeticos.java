package br.com.link.operadores;

// numa operação vai devolver o maior tipo
// toda conta devolve no mínimo um int
// divisão por zero em números inteiros dá erro de execução
public class TesteOperadoresAritmeticos {
	public static void main(String[] args) {
		int dois = 2;
		int dez = 10;
		int cinco = 5;

		System.out.println(dez + dois);
		System.out.println(dez - dois);
		System.out.println(dez * dois);
		System.out.println(dez / dois);
		System.out.println(cinco % dois);

		// divisão por zero em ponto flutuante retorna infinity ou -infinity
		System.out.println(5 / 0.0);
		System.out.println(-5 / 0.0);

		// NaN
		double positivoInfinito = 5 / 0.0;
		double negativoInfinito = -5.0 / 0;
		System.out.println(positivoInfinito + negativoInfinito);

	}
}
