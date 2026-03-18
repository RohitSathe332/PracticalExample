package JavaExample;

public class RemoveSpaceByUsingRplaceAll {
	public static void main(String[] args) {

		String str = "ja va st ar";
		String st = str.replaceAll("\\s", "");
		System.out.println(st);

	}

}