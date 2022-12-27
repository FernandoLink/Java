package br.com.link.excecoes;

public class TesteExcessao {

	public void fazAlgo(int[] idades) {
		try {
			System.out.println(idades[1]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
			System.out.println("----------------------------------------------------------------------------------");
		}
	}

	public static void main(String[] args) {
		new TesteExcessao().fazAlgo(new int[0]);

		String nome = null;

		try {
			nome.toLowerCase();
			System.out.println("Nao vai chamar se dar exception");
		} catch (Throwable ex) {
			System.out.println(ex.getMessage());
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println(ex.toString());
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println(ex.getClass());
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println(ex.getLocalizedMessage());
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println(ex.getCause());
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println(ex.getStackTrace());
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println(ex.getSuppressed());
		} finally {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Terminei");
		}
	}
}
