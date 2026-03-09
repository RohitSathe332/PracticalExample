package JavaExample;

class Parent{
	void sound() {
		System.out.println("abc");
	}
	
	void play() {
		System.out.println("play cricket parnet");
	}
}


class Child extends Parent{
	void sound() {
		System.out.println("man sound child");
	}
	
	void eat() {
		System.out.println("mango child");
	}
}

public class ExampleSingleInheritance  {
	public static void main(String[] args) {
	
	Child a=new Child();
	a.sound();
	a.eat();
	a.play();
	}
}
