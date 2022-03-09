import java.util.Arrays;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Items_Into_Cart_Waits_In_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait d= new WebDriverWait(driver,5);

		// Expected Array
		String[] veggiesItems = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, veggiesItems);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//Explicit wait
		
		d.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//Explicit Wait
		
		
		d.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		// driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		// Select country=new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div")));
		// country.selectByVisibleText("india");
		// driver.findElement(By.cssSelector("input.chkAgree")).click();
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
	}

	public static void addItems(WebDriver driver, String[] veggiesItems) {
		int j = 0;
		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < Products.size(); i++) {

			// Brocolli - 1 kg
			// Brocolli, 1 Kg

			String[] productName = Products.get(i).getText().split("-");

			// productName[0] - Brocolli

			// Remove space
			String formattedName = productName[0].trim();

			// Format it to get actual b=vegetable name TRIM Concept
			// Check whether name we extracted is present in array or not-
			// Convert Array into Array list for easy search
			//List veggiesItemsList = Arrays.asList(veggiesItems);
			List<String> veggiesItemsList = Arrays.asList(veggiesItems);

			if (veggiesItemsList.contains(formattedName)) {
				j++;
				// Click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// break;
				// 3 times to check all three
				if (j == veggiesItems.length)
					break;

			}

		}

	}

}