package AllMainClasses;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExapmle {
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=3066452137832600357&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301354&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
       
        // open new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        driver.get("https://www.jio.com");

        String parentWindowId=driver.getWindowHandle();
        System.out.println(parentWindowId);
        
       Set<String> allWindowIds=driver.getWindowHandles();
        System.out.println(parentWindowId);
        System.out.println(allWindowIds);
           
        for(String windowid:allWindowIds) {
        	if(!windowid.equals(parentWindowId)) {
        		System.out.println(windowid);
        		String childWindowTiltle=driver.getTitle();
        		System.out.println("childWindowTiltle"+childWindowTiltle);
        	}
        }
        driver.quit();
        
    }
}