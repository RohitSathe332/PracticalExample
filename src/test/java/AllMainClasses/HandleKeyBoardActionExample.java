
package AllMainClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleKeyBoardActionExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://extendsclass.com/text-compare.html");

        // Locate both CodeMirror editors
        WebElement firstEditor = driver.findElements(By.className("CodeMirror")).get(0);
        WebElement secondEditor = driver.findElements(By.className("CodeMirror")).get(1);

        Actions act = new Actions(driver);

        // ===== First editor =====
        firstEditor.click();

        // CLEAR existing text (CTRL + A + DELETE)
        act.keyDown(Keys.CONTROL)
           .sendKeys("a")
           .keyUp(Keys.CONTROL)
           .sendKeys(Keys.DELETE)
           .perform();

        // Enter new text
        act.sendKeys("Input add successfully")
           .keyDown(Keys.CONTROL)
           .sendKeys("a")   // CTRL + A
           .sendKeys("c")   // CTRL + C
           .keyUp(Keys.CONTROL)
           .perform();

        // ===== Second editor =====
        secondEditor.click();
        
        act.keyDown(Keys.CONTROL)
        .sendKeys("a")
        .keyUp(Keys.CONTROL)
        .sendKeys(Keys.DELETE)
        .perform();

        act.keyDown(Keys.CONTROL)
           .sendKeys("v")   // CTRL + V
           .keyUp(Keys.CONTROL)
           .perform();

        System.out.println("done all KeyBoard action");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;

     // Read text from both editors
     String firstText = (String) js.executeScript(
             "return document.getElementsByClassName('CodeMirror')[0].CodeMirror.getValue();");

     String secondText = (String) js.executeScript(
             "return document.getElementsByClassName('CodeMirror')[1].CodeMirror.getValue();");

     // Compare
     if (firstText.equals(secondText)) {
         System.out.println("Text copied into secondEditor box");
     } else {
         System.out.println("Text NOT copied into secondEditor box");
     }
    }
}
