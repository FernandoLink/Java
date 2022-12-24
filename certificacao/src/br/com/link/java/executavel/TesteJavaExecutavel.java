package br.com.link.java.executavel;

// javac TesteJavaExecutavel.java
// javac br\com\link\java\executavel\TesteJavaExecutavel.java 
// java TesteJavaExecutavel.java
// java br.com.link.java.executavel.TesteJavaExecutavel
// java TesteJavaExecutavel.java 1 2 3 4 5 
// java -Dsistema=producao TesteJavaExecutavel.java 1 2 3 4 5
// java -cp src br.com.link.java.executavel.TesteJavaExecutavel
// pode ser public ou não que compila e roda
class TesteJavaExecutavel {
	
	// public static void main(String... arguments) {
	public static void main(String[] args) {
		System.out.println("rodando o programa java via CLI");
		System.out.println(args.length);
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
