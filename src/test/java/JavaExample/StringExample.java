package JavaExample;

public class StringExample {
public static void main(String[] args) {
	String s1="Rohit";  // stroe in scp and heap memmory
	String s=s1;
	 s1=s+"Sathe";
	System.out.println(s1);
	System.out.println(s);
	//System.out.println(s2);
	
	//String is immutable;
	// immutbale reason 1) security 2) Memmory management 3)Hashmap 4)Thread Safety
	

}
}
