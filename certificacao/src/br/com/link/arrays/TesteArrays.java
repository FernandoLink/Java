package br.com.link.arrays;

// quando inicializa um array ele é inicializado com o valor default do tipo
// pode colocar o tamanho do array 0 e número negativo, compila
// número negativo dá exception em tempo de execução
public class TesteArrays {
	public static void main(String[] args) {
		int[] idades = new int[] { 0, 1, 2, 3, 4 };
		double pesos[] = { 1.0, 2.0, 3.0 }; // tem que ser na mesma linha este tipo de inicialização
		long[] numeros = new long[10];
		long[] tamanhos = new long[10];

		// declaração separada da inicialização tem que colocar o new
		numeros = new long[] { 0l, 2l, 4l, 5l, 6l };

		System.out.println(idades[0]);
		System.out.println(pesos[1]);
		System.out.println(numeros[2]);
		System.out.println(tamanhos[3]);
		System.out.println(idades.length);
		
		for(int idade: idades) {
			System.out.println(idade);
		}
	}
}
