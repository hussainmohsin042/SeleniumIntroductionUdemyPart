import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// 1. Give me the count of links on the page
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        
        // 2. Count of link spresent in the footer section
        
     //   Limit Webdriver Scope       
        
        
       WebElement footerdriver= driver.findElement(By.id("gf-BIG"));  // Limiting Webdriver Scope
       System.out.println(footerdriver.findElements(By.tagName("a")).size());
      
      // 3. Wnat links which are present in the 1st column of the footer
      
      WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
      System.out.println(columndriver.findElements(By.tagName("a")).size());
      
      // 4. Click on each link in the column and check if the page is opened
      
      for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
      {
    	  
    	 String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);   	  
    	 // columndriver.findElements(By.tagName("a")).get(i).click();
    	 // driver.navigate().back();
    	 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
    	 
    	 Thread.sleep(5000L);
    	 
      }
    	 
    	 Set<String> abc=driver.getWindowHandles();
    	 Iterator<String> it=abc.iterator();
    	 while(it.hasNext())
    	 {
    		 driver.switchTo().window(it.next());
    		 System.out.println(driver.getTitle());   		 
    		 
    		 
    	 }    	  
    	  
        }
      
       
	}


