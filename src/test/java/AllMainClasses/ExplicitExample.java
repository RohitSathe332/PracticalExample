package AllMainClasses;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;

public class ExplicitExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=3066452137832600357&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301354&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
        
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        
        WebElement elemnt=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.nav-ul > li:nth-child(3)")));
        //driver.findElement(By.cssSelector("ul.nav-ul > li:nth-child(3)"));
       
        elemnt.click();
        
        System.out.println("Explicit Work Successfully and click on the Element ");

       // driver.quit();
    }
}

//   RelativeXpath =//ul[@class='nav-ul']/li[3]")
//   Abosolute xapth= /html/body/div[1]/header/div/div[6]/div[2]/div/div/ul/li[3]/div/a
//   cssSelctor=By.cssSelector("ul.nav-ul > li:nth-child(3)")