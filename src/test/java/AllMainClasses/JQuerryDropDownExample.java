
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

public class JQuerryDropDownExample { 
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

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement dropdown = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("justAnInputBox")));

	
		dropdown.click();
		System.out.println("Click on Jquery Dropdown");
		  List<WebElement> opt =
		  driver.findElements(By.xpath("//ul//li[contains(@class,'ComboTreeItem')]//span"));
		  //opt.size();
		  System.out.println(opt.size());
		  for (WebElement option : opt) { 
			  System.out.println(option.getText().trim().equals("choice 2"));
			  if (option.getText().trim().equals("choice 2")) {
				    option.click();
				    break;
				}
		  }
		 
	}
}
//.equals("choice 2")

