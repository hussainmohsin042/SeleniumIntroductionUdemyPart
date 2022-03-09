import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_E2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
//		driver.get("https://google.com");
//		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("Cricbuzz");
//		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click();
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Username123456");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Password123456");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
	}

}
