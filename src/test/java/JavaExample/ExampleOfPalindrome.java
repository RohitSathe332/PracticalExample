package JavaExample;

public class ExampleOfPalindrome {
    public static void main(String[] args) {

        int num = 121;
        int original = num;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;   //0*10+1=1   1*10+2   12*10+1  
            num = num / 10;     //12 //1  
        }

        System.out.println("num " + original);
        System.out.println("num " + num);

        if (original == rev) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not a palindrome");
        }
    }
}