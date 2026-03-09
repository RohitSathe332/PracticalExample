package JavaExample;

interface Animal{
	abstract void sound();
}

class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Dog Sound");		
	}
	
}

class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("Cat Sound");		
	}
	
}
public class ExampleAbTractionByUsingInterface {
public static void main(String[] args) {
	Animal a=new Dog();
	Animal b=new Cat();
	a.sound();
	b.sound();
}
}
