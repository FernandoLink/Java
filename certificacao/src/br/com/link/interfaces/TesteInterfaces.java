package br.com.link.interfaces;

/*
 * uma classe abstract não precisa ter métodos abstract
 * mas uma class com 1 método abstract tem que ser abstract
 * método abstract não tem corpo, só defini a interface do método
 * eu só posso instanciar uma class abstract 
 * todos os métodos devem ser implementados de uma classe abstract
 * class abstract pode ter métodos com corpo ou sem corpo
 * 
 * interface não tem métodos com body
 * os métodos são todos public e abstract
 * posso extender quantas interfaces eu quiser
 * pode herdar de outra interface
 * interface não pode implementar outra interface
 * uma variável membro (CONSTANTE) da interface é por padrão public, static e final
 * interface não pode método static
*/
abstract class SemMetodo {

}

abstract class ComMetoAbstrato {
	abstract void executa();
}

public class TesteInterfaces {
	public static void main(String[] args) {
	}
}
