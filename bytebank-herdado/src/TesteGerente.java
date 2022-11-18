
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Fernando Link");
		g1.setCpf("816.289.279-68");
		g1.setSalario(25000.0);

		System.out.println(g1);

		g1.setSenha(7736);
		System.out.println(g1.autentica(7736));

		g1.setSalario(g1.getBonificacao());
		System.out.println(g1);

	}

}
