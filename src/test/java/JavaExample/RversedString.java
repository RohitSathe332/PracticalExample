package JavaExample;

public class RversedString {
public static void main(String[] args) {
	String rev=" java is easy";
	String result="";
	for(int i=rev.length()-1;i>=0; i--) {
	//System.out.println(rev.charAt(i));	
	result=result+rev.charAt(i);
	}
	System.out.println(result);
	
	StringBuilder sb=new StringBuilder(rev);
	System.out.println(sb.reverse());

}
}
