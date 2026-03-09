package AllMainClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://jqueryui.com/tooltip/");

	        // understsnt the how many iframe in the page
	        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
	        System.out.println("Total iframes on page: " + iframes.size());
	        System.out.println(iframes.get(0).getAttribute("src"));
	        
          //  driver.switchTo().frame(0);
	        WebElement tooltipelements=driver.findElement(By.className("demo-frame"));
	        driver.switchTo().frame(tooltipelements);
	        WebElement tooltipelement=driver.findElement(By.id("age"));
	        String tooltip=tooltipelement.getAttribute("title");
	        System.out.println(tooltip);
	        driver.switchTo().defaultContent();
	        driver.close();
	        driver.quit();
	       
	    }
}
