
public class FluxoComError {

	public static void main(String[] args) throws MinhaExcecao {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("ini do metodo 2");
		try {
			metodo2();
		} catch (StackOverflowError sof) {
			System.out.println(sof.getMessage());
		}
		System.out.println("fim do metodo 2");
	}
}
