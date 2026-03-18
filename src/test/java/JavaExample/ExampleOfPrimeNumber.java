package JavaExample;

public class ExampleOfPrimeNumber {
	public static void main(String[] args) {
		int num = 17;
		int count = 0;
		for (int i = 2; i < num; i++) {   //Replace i < num with i <= Math.sqrt(num) in the condition:  other wise i*i<=num
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("it is a prime number");

		} else {
			System.out.println("it is a not prime number");
		}
	}
}
