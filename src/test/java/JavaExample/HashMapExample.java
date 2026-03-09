package JavaExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {
	
	    public static void main(String[] args) {

	    	Map<Integer, String> map = new HashMap<>();

	        map.put(3, "Rohit");
	        map.put(1, "Amit");
	        map.put(2, "Sneha");
	        map.put(null, null);  // null key one  and null value  multiple allowed
	        map.put(4, null);
	        map.put(4, "Rohits");
	        map.put(null, "Rohits");

	        System.out.println(map);
	        System.out.println();
	        for(Map.Entry<Integer, String> entry : map.entrySet()) {
		        System.out.println(entry.getKey() +  " "+entry.getValue());	
		        }
	    }
	}

//{null=Rohits, 1=Amit, 2=Sneha, 3=Rohit, 4=Rohits}
//only one null key alloewd and multiple null valyue allowed