package JavaExample;

class RemoveSpaceBetweenTheWord {
	public static void main(String[] args) {
		//String word = "Java is easy ";
		String word = "Ja va ist a r";
		StringBuffer sb = new StringBuffer();
		int count = 0;
		for (char c : word.toCharArray()) {
			if (c != ' ') {
				sb.append(c);
			} else {
				count++;
			}
		}

		System.out.println("String After the Remove Space " + sb);
		System.out.println("coubt of spaces in string "+count);
	}
}
