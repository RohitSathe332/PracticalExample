package AllMainClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOfXpath {
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        // Implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	       
	        driver.get("https://xpath-by-shreenibas.netlify.app/?utm_source=chatgpt.com");
	        WebElement login = driver.findElement(By.xpath("//input[@id='username']"));                      // tagname and attribute
	        WebElement logins=driver.findElement(By.xpath("//button[@id='login-btn' and @class='btn']"));   // and 
	        logins.click();
	        WebElement lgn=driver.findElement(By.xpath("//button[@id='login-btn' or @class='btn']"));      // or
	        lgn.click();
	        WebElement txts=driver.findElement(By.xpath("//a[(text()='Forgot password?')]"));              // text 
	        txts.getText();
	        WebElement txt=driver.findElement(By.xpath("//p[contains(text(),'Use this single page to')]"));  // contaions
	        txt.getText();
	        WebElement str_with=driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));             // starts-with
	        str_with.click();
	       
	        System.out.println("done");
	        driver.close();
	 }
}
