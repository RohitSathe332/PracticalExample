
package AllMainClasses;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.get(
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=3066452137832600357&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301354&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

		public WebElement apply(WebDriver driver) {
				return driver.findElement(By.cssSelector("ul.nav-ul > li:nth-child(3)"));
			}
		});
		element.click();

		System.out.println("Fluent Wait Work Successfully and click on the Element ");

		// driver.quit();
	}
}
