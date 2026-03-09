package AllMainClasses;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureCookiesFromBrowser {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // driver.get("https://demoqa.com/slider");
        driver.get("https://www.jio.com");
        Cookie cke=new Cookie("bfvkjkhhkhge","hkjrhegrhe");
        driver.manage().addCookie(cke);
        
        // Capture all cookies
        Set<Cookie> cookies = driver.manage().getCookies();

        // Print cookies
        for (Cookie cookie : cookies) {
            System.out.println("Name  : " + cookie.getName());
            System.out.println("Value : " + cookie.getValue());
            System.out.println("Domain: " + cookie.getDomain());
            System.out.println("Path  : " + cookie.getPath());
            System.out.println("Expiry: " + cookie.getExpiry());
            System.out.println("Size: " + cookies.size());
            
            System.out.println("-----------------------------");
        }
         driver.manage().deleteAllCookies()  ;
        driver.quit();
    }
}
