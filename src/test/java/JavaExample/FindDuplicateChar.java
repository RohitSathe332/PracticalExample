package JavaExample;

public class FindDuplicateChar {
	public static void main(String[] args) {
		String str = "programming";
		char[] ch = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb.append(ch[i]);  
			}

		}
		System.out.println(sb);
	}

}
