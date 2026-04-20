package JavaExample;

public class ReverseStringAtSamePlace {
public static void main(String[] args) {
	String str="java is easy";
	String[] words=str.split(" ");
	String output="";
	for(String word:words) {
		String revWord="";
		for(int i=word.length()-1;i>=0;i--) {     // index strating from 0 so word.length()-1 otherwise give arrayIndexOutOfBoundException
			revWord=revWord+word.charAt(i);
		}
		output=output+revWord+" ";
	}
	System.out.println(output);
}
}
