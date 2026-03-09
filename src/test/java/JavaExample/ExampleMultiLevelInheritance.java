package JavaExample;

class Animals {
	void eat() {
		System.out.println("Animal eats");
	}
}

class Dogs extends Animals {
	void bark() {
		System.out.println("Dog barks");
	}
}

class Puppy extends Dogs {
	void weep() {
		System.out.println("Puppy weeps");
	}
}

public class ExampleMultiLevelInheritance {
	public static void main(String[] args) {

		Puppy a = new Puppy();
		a.weep();
		a.bark();
		a.eat();
	}
}