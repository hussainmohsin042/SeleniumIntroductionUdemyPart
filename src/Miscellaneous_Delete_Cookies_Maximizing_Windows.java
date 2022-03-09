import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Miscellaneous_Delete_Cookies_Maximizing_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); //ALL
		//driver.manage().deleteCookieNamed("sessionKey");
		//driver.manage().addCookie(null); // not in the real time
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	}

}
