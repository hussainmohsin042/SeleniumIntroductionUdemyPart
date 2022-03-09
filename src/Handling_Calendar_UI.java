import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Calendar_UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");

		// Provide the date 18 June 2021

		// driver.findElement(By.cssSelector("[class='datepicker-days']
		// [class='datepicker-switch']")).getText().contains("April");

		driver.findElement(By.id("travel_date")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("January")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

		}
		List<WebElement> day = driver.findElements(By.className("day"));

		// Grab the common Attribute // Put it into List and Iterate
		int count = driver.findElements(By.className("day")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}

	}

}
