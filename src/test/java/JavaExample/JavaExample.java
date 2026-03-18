package JavaExample;
import java.util.HashMap;

public class JavaExample {

    public static int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
            	// 0<6 && 1000<100  
            	//1<5  
            	//2<4
            	//3<3
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        String roman = "MCMXCIV";  //1000-100+1000-10+100-1+5

        int result = romanToInt(roman);

        System.out.println("Integer value: " + result);
    }
}
