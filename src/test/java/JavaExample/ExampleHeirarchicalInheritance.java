package JavaExample;

class Animalss {
	void eat() {
		System.out.println("Animal eats");
	}
}

class Dogss extends Animalss {
	void bark() {
		System.out.println("Dog barks");
	}
}

class Catss extends Animalss {
	void meow() {
		System.out.println("Cat meows");
	}
}


public class ExampleHeirarchicalInheritance {
	public static void main(String[] args) {
		Dogss a = new Dogss();
		Catss b = new Catss();
		a.bark();
		a.eat();
		b.meow();
		b.eat();
	}
}