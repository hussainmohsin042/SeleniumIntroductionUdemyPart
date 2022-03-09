import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Java_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "Mohsin Hussain";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);
		Thread.sleep(3000);
		// driver.findElement(By.id("alertbtn")).click();

		// OK
		// driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		// ok and Cancel
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		// driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

	}

}
