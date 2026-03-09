
package AllMainClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkNewTab {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		WebElement link=driver.findElement(By.xpath("//a[text()='Back To jQueryScript.Net']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open(arguments[0], '_blank');",
                link.getAttribute("link"));
		//String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		//driver.findElement(By.xpath("//a[text()='Back To jQueryScript.Net']")).sendKeys(tab);
        //driver.close();
		//driver.findElement(By.xpath("//a[text()='Back To jQueryScript.Net']")).click();
	}
}
