import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// Xpath for "Bengaluru" --- //a[@Value='BLR']------ From
		// driver.findElement(By.xpath("//a[@Value='BLR']")).click();

		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@Value='BLR']"))
				.click(); // Parent-Child Relationship

		Thread.sleep(2000);

		// Xpath for "Chennai" --- //a[@Value='MAA'] ------ To

		// driver.findElement(By.xpath("//a[@Value='MAA']")).click();

		// driver.findElement(By.xpath("(//a[@Value='MAA'])[2]")).click();

		driver.findElement(
				By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@Value='MAA']")).click();

	}

}
