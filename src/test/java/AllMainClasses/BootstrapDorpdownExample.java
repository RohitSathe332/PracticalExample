
package AllMainClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapDorpdownExample {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		// WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement dropdown = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")));

		/*
		 * WebElement dropdown = wait
		 * .until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//button[@class='btn btn-primary dropdown-toggle']")));
		 */
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", dropdown);

		dropdown.click();
		System.out.println("Scroll method working properly and click on elment");

       List<WebElement> opt = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		for (WebElement option : opt) {
			if (option.getText().equals("HTML")) {
				option.click();
				break;
			}
		}
		System.out.println("Click on Dropdown Element");
		//Thread.sleep(5000);
		driver.close();
	}
}
