package JavaExample;

public class ReverseNumberByUsingInBuiltMethod {
	public static void main(String[] args) {
		int num = 1111111;
		String str = String.valueOf(num);
		StringBuffer sb = new StringBuffer(str);
		int revNum = Integer.parseInt(sb.reverse().toString());
		if(revNum==num) {
			System.out.println("number is prime");			
		}else {
			System.out.println("Number is not Prime");
		}
	}
}
