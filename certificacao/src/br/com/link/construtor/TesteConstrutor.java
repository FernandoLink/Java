package br.com.link.construtor;

class Mae {
	long numeroPai;

	Mae() {

	}

	Mae(String s) {
		System.out.println("mae");
	}

	Mae(int i) {

	}
}

class Filha extends Mae {

	String s;
	long numeroFilha;

	Filha() {
		super();
	}

	Filha(String s) {
		super(s);
		this.s = s;
		System.out.println(s);
	}

	Filha(int i) {
		this("numero: " + i);
		numeroPai = 53;
		this.numeroPai = 53;
		super.numeroPai = 53;
		numeroFilha = 1;
		this.numeroFilha = 2;
	}
}

class Vehicle {
	int velocity;
}

class Car extends Vehicle {
	int velocity;

	int CarVelocity() {
		return this.velocity;
	}

	int VehicleVelocity() {
		return super.velocity;
	}

}

// por padrão cria construtor super() sem argumentos, pode ser removido
// super e this tem que ser a primeira instrução no construtor
// private e static não faz sentido super e this
public class TesteConstrutor {
	public static void main(String[] args) {
		new Filha("link");
		new Filha(4);

		Car c = new Car();
		((Vehicle) c).velocity = 50;
		System.out.println("Car: " + c.CarVelocity());
		System.out.println("Vehicle: " + c.VehicleVelocity());

		Car c1 = new Car();
		c1.velocity = 50;
		System.out.println("Car: " + c1.CarVelocity());
		System.out.println("Vehicle: " + c1.VehicleVelocity());
	}
}
