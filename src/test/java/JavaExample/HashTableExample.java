package JavaExample;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableExample {
	
	    public static void main(String[] args) {

	        Map<Integer, String> ht = new Hashtable<>();

	        ht.put(101, "Rohit");
	        ht.put(102, "Amit");
	        ht.put(103, "Sneha");
	       // ht.put(null, null);  // getting  java.lang.NullPointerException  // not allowed null key and value 

	        System.out.println(ht);
	        for(Map.Entry<Integer, String> entry : ht.entrySet()) {
	        System.out.println(entry.getKey() +  " "+entry.getValue());	
	        }
	    }
	}
