import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("UN9876543210");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("acbcefghi");
		// driver.findElement(By.cssSelector("[id='Login']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
	}

}
