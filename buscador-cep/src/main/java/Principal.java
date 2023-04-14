import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		ConsultaCep consultaCep = new ConsultaCep();

		System.out.println("Digite o CEP: ");
		var cep = leitura.nextLine();
		try {
			Endereco endereco = consultaCep.buscaEndereco(cep);
			System.out.println(endereco);
			GeradorDeArquivo gerador = new GeradorDeArquivo();
			gerador.salvaJson(endereco);
		} catch (RuntimeException | IOException e) {
			System.out.println(e.getMessage());
			System.out.println("The End!!!");
		}
	}
}
