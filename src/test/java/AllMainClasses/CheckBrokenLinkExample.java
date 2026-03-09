package AllMainClasses;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrokenLinkExample {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("");
		List<WebElement> brokenLinks = driver.findElements(By.tagName("a"));
		int brokenLink = 0;
		for (WebElement element : brokenLinks) {
			String url = element.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("url is null or empty");
				continue;
			}

			try {
				URL link = new URL(url);
				HttpURLConnection httpconnecttion = (HttpURLConnection)link.openConnection();
				httpconnecttion.connect();

				if (httpconnecttion.getResponseCode() >= 400) {
					System.out.println("broken Link " + url + " " + httpconnecttion.getResponseCode());
					brokenLink++;
				} else {
					System.out.println("Valid link");

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Broken link number is " + brokenLink);
	}
}
