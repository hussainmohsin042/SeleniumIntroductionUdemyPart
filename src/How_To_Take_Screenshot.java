import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class How_To_Take_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // ALL
		// driver.manage().deleteCookieNamed("sessionKey/sessionID");
		// driver.manage().addCookie(null); // not in the real time
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(
				"C:\\Users\\mopara\\eclipse-workspace\\Selenium_Introduction\\src\\Screenshot\\screenshot1.png"));
		// FileUtils.copyFile(src,new File("C:\\Users\\mopara\\Desktop\\Mandatory
		// Trainings\\ScreenshotTaken.png"));

	}

}
