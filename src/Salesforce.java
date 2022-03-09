import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// Firefox

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\mopara\\Desktop\\Selenium\\Browser_Drivers\\Firefox\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		// driver.findElement(By.id("username")).sendKeys("Username");
		driver.findElement(By.cssSelector("#username")).sendKeys("username12345");
		// driver.findElement(By.name("pw")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password");
		// driver.findElement(By.className("button r4 wide primary")).click();
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();// Xpath
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}

}
