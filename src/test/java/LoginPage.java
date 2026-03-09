import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
  
	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	// Locators
	By txt_username_loc=By.id("dgh");
	By txt_password_loc=By.id("dgf");
	By btn_login_loc=By.id("dgf");
	
	
	// Action methods
	
	//WebElement usreText1=driver.findElement(usreText_loc);
	//WebElement passwordText=driver.findElement(passwordTextt_loc);
}
