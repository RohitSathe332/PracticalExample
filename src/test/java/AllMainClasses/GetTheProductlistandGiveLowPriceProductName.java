package AllMainClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheProductlistandGiveLowPriceProductName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/s?k=mobile");

		Thread.sleep(5000); // wait for page load

		List<WebElement> products = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
        System.out.println(products.size());
		int lowestPrice = Integer.MAX_VALUE;
		String lowestProduct = "";

		for (WebElement product : products) {

			try {
				String name = product.findElement(By.xpath(".//h2/span")).getText();

				String priceText = product.findElement(By.xpath(".//span[@class='a-price-whole']")).getText();

				//System.out.println(priceText);
				priceText = priceText.replace(",", ""); // remove comma
				int price = Integer.parseInt(priceText);
			//	System.out.println(price);

				System.out.println(name + " --> ₹" + price);

				if (price < lowestPrice) {
					lowestPrice = price;
					lowestProduct = name;
				}

			} catch (Exception e) {
				// skip if price not available
			}
		}

		System.out.println("\n✅ Lowest Price Mobile:");
		System.out.println(lowestProduct + " --> ₹" + lowestPrice);

		driver.quit();
	}

}
