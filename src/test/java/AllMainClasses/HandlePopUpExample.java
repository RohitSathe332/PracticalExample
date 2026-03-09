package AllMainClasses;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlePopUpExample {

    public static void main(String[] args) {

        // Disable notification popup
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // ---------------- Simple Alert ----------------
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        simpleAlert.click();
        driver.switchTo().alert().accept();
        System.out.println("Closed simple alert");

        // ---------------- Confirmation Alert ----------------
        WebElement confirmAlert = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        confirmAlert.click();
        driver.switchTo().alert().dismiss();
        System.out.println("Closed confirmation alert");

        // ---------------- Prompt Alert ----------------
        WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        promptAlert.click();

        Alert prompt = wait.until(ExpectedConditions.alertIsPresent());
        prompt.sendKeys("Rohit");
        prompt.accept();
        System.out.println("Closed prompt alert");

        // ---------------- Authentication Popup ----------------
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        System.out.println("Authentication popup handled");

        // ---------------- Notification Popup Example ----------------
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.cleartrip.com/");
        System.out.println("Notification popup disabled");

        driver.quit();
    }
}
