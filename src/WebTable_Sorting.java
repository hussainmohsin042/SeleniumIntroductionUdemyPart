import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class WebTable_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
		
		// Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		// Capture all web elements into the list
		
		List<WebElement> itemsList= driver.findElements(By.xpath("//tr/td[1]"));
		
		// Capture text of all web elements into new (Original) list
		 List<String> originalList= itemsList.stream().map(s->s.getText()).collect(Collectors.toList());
		 //List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		 //Assert.assertTrue(originalList.equals(sortedList));
		 		
		// Sort on the Original list of Step 3   ----> Sorted List
		  List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		// Compare Original VS Sorted List
		  Assert.assertTrue(originalList.equals(sortedList));
		  	
		  
		// I want to get the price of each vegetable  
		  
	    // Scan the name column with Get Text -> Beans -> Print the Price of that vegetable(Beans)
		  
		//  List<String> price=itemsList.stream().filter(s->s.getText().contains("Beans")).
		//  map(s->getPriceVeggie(s)).collect(Collectors.toList());
		//  price.forEach(a->System.out.println(a));
		  
			
		 //  Print the Price of that vegetable(Rice)
		  
		  List<String> price;
		  do
		  {
		  List<WebElement> rows= driver.findElements(By.xpath("//tr/td[1]"));  
		  price=rows.stream().filter(s->s.getText().contains("Rice")).
		  map(s->getPriceVeggie(s)).collect(Collectors.toList());
		  price.forEach(a->System.out.println(a));
		  if(price.size()<1)
		  {
			  
			    driver.findElement(By.xpath("//div/ul/li[7]")).click();
			   //   driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		  }
	}	
		  while(price.size()<1);
	
}


private static String getPriceVeggie(WebElement s)
          {
        	 String priceValue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
        //	 System.out.println(priceValue);
        	  return priceValue;
          }
   }

