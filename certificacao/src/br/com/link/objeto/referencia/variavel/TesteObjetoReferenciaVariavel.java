package br.com.link.objeto.referencia.variavel;

class ObjetoMeu {
	int valor;
}
public class TesteObjetoReferenciaVariavel {
	public static void main(String[] args) {
		// tipo primitivo é sempre por valor
		int a = 10;
		int b = a;
		b++;
		a += 5;
		System.out.println(a);
		System.out.println(b);
		
		ObjetoMeu o1 = new ObjetoMeu();
		o1.valor = 10;
		ObjetoMeu o2 = o1;
		
		System.out.println(o1.valor);
		System.out.println(o2.valor);
			
		o2.valor++;
		System.out.println(o1.valor);
		System.out.println(o2.valor);
		
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
	}
}
