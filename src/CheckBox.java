import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is one of the testing framework

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@Value='BLR']"))
				.click(); // Parent-Child Relationship
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@Value='MAA']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertFalse(false);
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();

		// Calendar:

		// locator:.ui-state-default.ui-state-highlight.ui-state-active

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// .out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) {

			System.out.println("It is enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// count the number of checkboxes:

		// System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// Assignment

		// driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	    driver.findElement(By.id("checkBoxOption1")).click();
//	    //System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//	    Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//	   System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
