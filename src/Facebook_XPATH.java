import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_XPATH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Chrome

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://facebook.com");
//		driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[11]/a")).click();
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("username123456");
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password12345");
//		driver.findElement(By.xpath("//button[@name='login']")).click();

		// CSS

//	   driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hussainmohisn042");
//	   driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("password987654321");
//	   //driver.findElement(By.cssSelector("button[name='login']")).click();
//	   driver.findElement(By.cssSelector("[name='login']")).click();
//	   

		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("#username")).sendKeys("username12345");
		driver.findElement(By.cssSelector("#password")).sendKeys("Password");
		driver.findElement(By.cssSelector("#Login")).click();// Xpath
	}

}
