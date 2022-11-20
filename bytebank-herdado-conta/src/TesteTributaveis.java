
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100.0, 222, 333, "Fernando Link");

		SeguroVida sv = new SeguroVida();

		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);

		System.out.println(ci.getTotalImposto());
	}

}
