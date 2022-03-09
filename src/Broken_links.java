import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Broken_links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // ALL
		// driver.manage().deleteCookieNamed("sessionKey");
		// driver.manage().addCookie(null); // not in the real time
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// Broken URL
		// JAVA methods will call URL's and gets the status code
		// href attribute which is tied to the links

		// Step 1 is to get all the URL tied up with the links
		// JAVA methods will call URL's and gets the status code
		// If status code is greater than 400 then the tied URL is broken
		// it is a mix of Sel + Java

		// String url=
		// driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");

		// String url=
		// driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode = conn.getResponseCode();
			System.out.println(respcode);
			// Assert.assertTrue(respcode<400, "The Link with Text" +link.getText()+ "is
			// broken with status code" +respcode);
			a.assertTrue(respcode < 400,
					"The Link with Text" + link.getText() + "is broken with status code" + respcode);
		}
		a.assertAll();

		/*
		 * HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		 * conn.setRequestMethod("HEAD"); conn.connect(); int
		 * respcode=conn.getResponseCode(); System.out.println(respcode);
		 */
	}

}
