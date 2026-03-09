package JavaExample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Mango");
        //map.put(null, null);  // getting Nullpointer Exception not allowed null key but null multiple value allowed 
        map.put(4,  null);
        map.put(5,  null);
        System.out.println(map);
        System.out.println();
        for(Map.Entry<Integer,String> entry:map.entrySet()) {
        	System.out.println(entry.getKey()+""+entry.getValue());
        }
    }
}

