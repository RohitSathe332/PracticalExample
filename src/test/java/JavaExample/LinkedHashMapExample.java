package JavaExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();

		map.put(1, "Apple");
		map.put(3, "Banana");
		map.put(2, "Orange");
		map.put(4, "Mango");
		map.put(null, null); // allowed One null key and multiple null value
		map.put(5, null);
		map.put(null, "Rohit");
		System.out.println(map);

		// output= {1=Apple, 3=Banana, 2=Orange, 4=Mango, null=Rohit, 5=null} Insertion
		// oreder maitain
		System.out.println();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}