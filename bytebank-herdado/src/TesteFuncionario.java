
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente link = new Gerente();

		link.setNome("Fernando Link");
		link.setCpf("816.289.279-68");
		link.setSalario(11500.0);
		System.out.println(link);

		link.setSalario(link.getBonificacao());
		System.out.println(link);

	}

}
