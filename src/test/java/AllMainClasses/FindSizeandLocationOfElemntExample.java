package AllMainClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindSizeandLocationOfElemntExample {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://jqueryui.com/tooltip/");

	        //switch ifram by using iframe webelemnt
	        WebElement tooltipelements=driver.findElement(By.className("demo-frame"));
	        driver.switchTo().frame(tooltipelements);
	        	        
	        WebElement tooltipelement=driver.findElement(By.id("age"));
	        
	        //Location
	        System.out.println("location X and Y "+tooltipelement.getLocation());
	        System.out.println("location X "+tooltipelement.getLocation().getX());
	        System.out.println("location Y "+tooltipelement.getLocation().getY());
	        
	        System.out.println("location X "+tooltipelement.getRect().getX());
	        System.out.println("location Y "+tooltipelement.getRect().getY());
	        
	        //size
	        System.out.println("Elemnt Height and width "+tooltipelement.getSize());
	        System.out.println("Elemnt  width "+tooltipelement.getSize().getWidth());
	        System.out.println("Elemnt  Height"+tooltipelement.getSize().getHeight());
	        	        
	        System.out.println("Elemnt  width "+tooltipelement.getRect().getDimension().getWidth());
	        System.out.println("Elemnt  Height "+tooltipelement.getRect().getDimension().getWidth());
	        
	        driver.quit();
	    }
}
