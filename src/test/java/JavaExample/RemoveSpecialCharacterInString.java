package JavaExample;

public class RemoveSpecialCharacterInString {
public static void main(String[] args) {
	String str="$%SJfhkjhkhrk878AS(*)";
	String planeStr=str.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(planeStr);
}
}
