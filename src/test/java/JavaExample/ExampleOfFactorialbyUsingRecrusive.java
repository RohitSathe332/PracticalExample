package JavaExample;

public class ExampleOfFactorialbyUsingRecrusive {
	 static int factorial(int n) {
	        if (n == 0) { // base case
	            return 1;
	        } else {
	            return n * factorial(n - 1); // recursive call
	        }
	    }

	    public static void main(String[] args) {
	        int n = 6;
	        System.out.println(factorial(n)); // call recursive method
	    }
}
//fhrhfhjrhfkjhrhhf