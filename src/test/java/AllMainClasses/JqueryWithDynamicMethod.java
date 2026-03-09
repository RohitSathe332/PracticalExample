package AllMainClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JqueryWithDynamicMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		// Open the dropdown
		WebElement dropdown = driver.findElement(By.id("justAnInputBox"));
		dropdown.click();

		List<WebElement> allItems = driver.findElements(By.xpath("//span[contains(@class,'comboTreeItemTitle')]"));
		// System.out.println("Total Items Found: " + allItems.size());
		// Loop through and select all
		selectOptions(allItems, "all");
		driver.quit();
	}

	public static void selectOptions(List<WebElement> ele, String... value) {
		if (!value[0].equalsIgnoreCase("all")) {
			for (WebElement item : ele) {
				try {
					if (item.isDisplayed() && item.isEnabled()) {
						for (String values : value) {
							if (item.getText().equals(values)) {
								item.click();
								Thread.sleep(300);// wait for each click
								System.out.println("click item: " + item.getText());
								
							}
						}
					}
				} catch (Exception e) {
					System.out.println("Cannot click item: " + item.getText());
				}
			}

		} else {
			for (WebElement item : ele) {
				item.click();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}