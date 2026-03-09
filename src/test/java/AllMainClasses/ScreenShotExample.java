package AllMainClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.commands.TakeScreenshot;
import com.google.common.io.Files;

public class ScreenShotExample {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=3066452137832600357&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301354&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//for fullpage Screenshot
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\Screenshot\\fullpage.png");
	
		//When folder is not available then use this
		// File targetFile = new File(System.getProperty("user.dir") + File.separator
		// +"Screenshot" + File.separator + "fullpage.png");                      
		try {
			targetFile.getParentFile().mkdirs();
			Files.copy(sourcefile, targetFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//for Page Element Screenshot
		  
	  /*  WebElement elemnt=driver.findElement(By.id("dropdown"));
		File sourcefileElement = elemnt.getScreenshotAs(OutputType.FILE);
		File targetFileElement = new File(System.getProperty("user.dir") + "\\Screenshot\\PageElement.png");
		try {
			Files.copy(sourcefileElement, targetFileElement);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}
}
