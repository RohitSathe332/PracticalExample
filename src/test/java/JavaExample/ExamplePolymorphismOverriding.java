package JavaExample;

class Mains {
	int add(int a, int b) { // acesss any package and class
		return a + b;
	}
}

public class ExamplePolymorphismOverriding extends Mains {
	@Override
	public int add(int a, int b) {   //access specifier is required bigger than the parent  otherwise same 
		System.out.println("child");
		return a + b;
	}

	public static void main(String[] args) {
		Mains abc = new ExamplePolymorphismOverriding();
		System.out.println(abc.add(5, 5));
	}
}