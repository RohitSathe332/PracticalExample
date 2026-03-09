package AllMainClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleDropDownExample {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	        driver.get("https://the-internet.herokuapp.com/dropdown");
	        
	       WebElement elemnt=driver.findElement(By.id("dropdown"));
	       Select select=new Select(elemnt);
	     
	       // by using select class method
	       
	       // select.selectByVisibleText("Option 1");
	     //select.selectByIndex(1);
	     //  select.selectByValue("1");
	      
	      
	     // without selectclass method 
	     List<WebElement> allOption= select.getOptions();
	     for(WebElement option:allOption) {
	    	 if(option.getText().equals("Option 1")) {
	    		 option.click();
	    		 break;
	    	 }
	     }
	       driver.close();
	    }
	}
