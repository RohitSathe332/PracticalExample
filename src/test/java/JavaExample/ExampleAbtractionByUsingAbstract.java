package JavaExample;

abstract class AbtractClassParent {
	protected abstract void start();

	void fuelType() {
		System.out.println("Most Vehicle use petroland Diesel");

	}

}

class AbtractClassFirst extends AbtractClassParent {

	@Override
	protected void start() {
		System.out.println("use the petrol");
	}
}

class AbtractClassSecond extends AbtractClassParent {

	@Override
	protected void start() {
		System.out.println("use the diesel");
	}
}

public class ExampleAbtractionByUsingAbstract {
	public static void main(String[] args) {
		AbtractClassParent first=new AbtractClassFirst();
		AbtractClassParent seocnd=new AbtractClassSecond();
		
	    first.start();
		seocnd.start();
		first.fuelType();
		seocnd.fuelType();
	}
}
