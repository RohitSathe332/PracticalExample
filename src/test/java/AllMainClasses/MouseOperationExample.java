package AllMainClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationExample {
	  public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demoqa.com/buttons");
            Actions act=new Actions(driver);
            
            //double click operation by using Action class method contextCLick()
            
            WebElement doubleClickElement=driver.findElement(By.id("doubleClickBtn"));
            act.doubleClick(doubleClickElement).perform();
            System.out.println("Done Double Click");
                        
            //double click operation by using Action class method contextCLick()
            
            WebElement rightClickElement=driver.findElement(By.id("rightClickBtn"));
            act.contextClick(rightClickElement).perform();
            System.out.println("Done Right Click");
            
          //moveToElemnt  operation by using Action class method moveToElement()
            
            driver.switchTo().newWindow(WindowType.WINDOW);
            driver.get("https://demoqa.com/menu");
            Thread.sleep(2000);
            
            WebElement moveToElement=driver.findElement(By.xpath("//ul[@id='nav']/li[2]"));
            WebElement moveToElements=driver.findElement(By.xpath("//ul[@id='nav']/li[2]//li[3]"));
            act.moveToElement(moveToElement).moveToElement(moveToElements).perform();
            System.out.println("MoveToElement Action Done");
            Thread.sleep(2000);
            
           // Drag and Drop Action perform by using clickAndHold(),moveToElement(),release() method        
            driver.switchTo().newWindow(WindowType.WINDOW);
            driver.get("https://demoqa.com/sortable");
            Thread.sleep(2000);
            
            WebElement sourceElement=driver.findElement(By.xpath("//div[@id='demo-tabpane-list']//div[text()='One']"));
            WebElement targetElement=driver.findElement(By.xpath("//div[@id='demo-tabpane-list']//div[text()='Four']"));
            
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", targetElement);

           //act.dragAndDrop(sourceElement, targetElement).perform();
            act.clickAndHold(sourceElement).moveToElement(targetElement).pause(Duration.ofMillis(500)).release().perform();
            Thread.sleep(2000);
            System.out.println("drag and Drop done");
	        driver.quit();
	    }
}
