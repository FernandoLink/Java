package br.com.link.string.builder.buffer;

class Objeto {
	int seila = 0;

	@Override
	public String toString() {
		return "Objeto [seila=" + seila + "]";
	}

}

// StringBuffer é sincronizado e StringBuilder não
// StringBuffer é threadsafe
// servem para manipular dados de Strings dinamicamente
public class TesteStringBufferBuilder {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Fernando Link");
		System.out.println(sb);
		sb.append(" - practice");
		System.out.println(sb);
		sb.delete(14, 16);
		System.out.println(sb);

		// pode criar sem passar parâmetro
		StringBuffer sb1 = new StringBuffer();
		// pode criar com tamanho
		StringBuffer sb2 = new StringBuffer(50);
		// pode copiar de outro StringBuffer
		StringBuffer sb3 = new StringBuffer(sb);
		sb3.append(" and don't give up");
		sb3.append('X');
		sb3.append(sb);
		// vai chamar o toString do objeto
		// se não sobreescrever o toString vai imprimir o toString padrão
		sb3.append(new Objeto());
		System.out.println(sb3);

		sb3.insert(13, " teste insert ");
		System.out.println(sb3);
		sb3.delete(13, sb3.length());
		System.out.println(sb3);

		// jogar para uma String
		String valor = sb3.toString();

		System.out.println(sb3.reverse());

		System.out.println(sb3.charAt(2));
		System.out.println(sb3.equals(sb1));
		System.out.println(sb3.indexOf("nan"));
		System.out.println(sb3.lastIndexOf("re"));
		// substring e subSequence não alteram a string
		System.out.println(sb3.substring(5, 10));
		System.out.println(sb3);
		System.out.println(sb3.subSequence(6, 10));

	}
}
