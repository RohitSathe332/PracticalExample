package AllMainClasses;

import java.time.Duration;
import java.util.Stack;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleofValidStntaxForsyntac {
	public static void main(String[] args) {

		String str = "({})";

		if (isValid(str)) {
			System.out.println("Valid Parentheses");
		} else {
			System.out.println("Invalid Parentheses");
		}

		if (isValids(str)) {
			System.out.println("Valid Parentheses new ");
		} else {
			System.out.println("InValid Parentheses new ");
		}
	}

	public static boolean isValid(String str) {

		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {

			// opening brackets
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}

			// closing brackets
			else if (ch == ')' || ch == '}' || ch == ']') {

				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.pop();

				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}
			}

			// ignore other characters
		}

		return stack.isEmpty();
	}

	public static boolean isValids(String str) {

		// remove other characters if present
		str = str.replaceAll("[^(){}\\[\\]]", "");

		while (str.contains("()") || str.contains("{}") || str.contains("[]")) {

			str = str.replace("()", "");
			str = str.replace("{}", "");
			str = str.replace("[]", "");
		}

		return str.isEmpty();
	}

}
