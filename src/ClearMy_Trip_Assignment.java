import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearMy_Trip_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Select adultoption = new Select(driver.findElement(By.id("Adults")));
		adultoption.selectByValue("3");
		Select childoption = new Select(driver.findElement(By.id("Childrens")));
		childoption.selectByValue("4");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight ui-state-active")).click();
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Vistara");
		driver.findElement(By.id("booking large mt15")).click();
		String Errormsg = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(Errormsg);

	}

}
