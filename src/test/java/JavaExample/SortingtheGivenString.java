package JavaExample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingtheGivenString {
	public static void main(String[] args) {
		String str = "deac";
		char[] ch = str.toCharArray();
		//Arrays.sort(ch);
		System.out.println(new String(ch));
	
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(new String(ch));
	}
}
