import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Selenium Code
		// Create Driver Object For Chrome Browser
		// We will strictly Implement Methods Of WebDriver
		// class name=x;
		// x driver = new x();
		// Invoke .exe file first

		// Chrome

		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\mopara\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Firefox

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\mopara\\Desktop\\Selenium\\Browser_Drivers\\Firefox\\geckodriver-v0.29.1-win64\\geckodriver.exe");

		// InternetExplorer

		// System.setProperty("webdriver.ie.driver",
		// "C:\\Users\\mopara\\Desktop\\Selenium\\Browser_Drivers\\InternetExplorer\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");

		// WebDriver driver=new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		// WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.google.com");//hit url on the Browser
		// System.out.println(driver.getTitle());// Validate the title of the web page
		// is correct
		// System.out.println(driver.getCurrentUrl());// Validate if we land on the
		// Correct URL
		// System.out.println(driver.getPageSource()); //Print Page Source

		// driver.get("https:yahoo.com");
		// driver.navigate().back();// Navigates back to the google
		// driver.navigate().forward();// Navigates forward to the Yahoo
		// driver.close();// Closes the current browser
		// driver.quit();// Closes all the browser
		driver.get("http://facebook.com");
		driver.findElement(By.name("email")).sendKeys("This Is My First Code");// Name
		driver.findElement(By.id("pass")).sendKeys("Password");// Id
		// driver.findElement(By.linkText("पासवर्ड विसरला?")).click();//LinkText
		// driver.findElement(By.xpath("//*[@name=login]")).click();
		driver.findElement(By.name("login")).click();
	}

}
