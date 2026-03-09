package AllMainClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSliderAndFindLocationSize {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://demoqa.com/slider");
	        Thread.sleep(3000); // wait to visually confirm page load
	        
	       //  Hanlde slider
	        WebElement min_slider=driver.findElement(By.xpath("//span//input[@type='range']"));
	        System.out.println("Location of min slider "+min_slider.getLocation());
	        System.out.println("Size of min slider "+min_slider.getSize());
	        
	        Actions act=new Actions(driver);
	        act.dragAndDropBy(min_slider,100,0).perform();
	        System.out.println("Dragand Drop done Successfully");
	        driver.quit();
	    }
}
