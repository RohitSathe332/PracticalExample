package JavaExample;

class Main {
	public int add(int a, int b) {  //acesss any package and class
		return a + b;
	}

	int add(int a, int b, int c) {   // access in same package only 
		return a + b + c;
	}

	protected double add(int a, int b, double c) { // access in same package but we want to access different pkg then inherit it
		return a + b + c;
	}
}


public class ExamplePolymorphismOverLoading {
	public static void main(String[] args) {
		Main abc=new Main();
		System.out.println(abc.add(10,20));
		System.out.println(abc.add(10,20,30));
		System.out.println(abc.add(10,20,30.50));
	}
}