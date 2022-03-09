import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HYD']"))
				.click(); // Parent-Child Relationship
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='SXR']"))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")) {

			System.out.println("It is enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(3000);
		WebElement staticDropdown = driver.findElement(By.name("ctl00$mainContent$ddl_Adult"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("3");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// driver.findElement(By.name("ctl00$mainContent$ddl_Adult")).click();
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();

	}

}
