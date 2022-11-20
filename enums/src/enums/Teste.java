package enums;

public class Teste {

	public static void main(String[] args) {

		Prioridade pMin = Prioridade.MIN;
		Prioridade pNor = Prioridade.NORMAL;
		Prioridade pMax = Prioridade.MAX;

		System.out.println(pMin.name());
		System.err.println(pNor.name());
		System.out.println(pMax.name());

		System.out.println(pMin.ordinal());
		System.out.println(pNor.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		System.out.println(pNor.getValor());
		System.out.println(pMax.getValor());

	}

}
