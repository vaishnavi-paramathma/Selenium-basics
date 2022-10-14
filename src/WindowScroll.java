import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500;");
        
       List<WebElement> value =  driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
       int total = 0;
       for(int i=0; i<value.size(); i++) {
    	 total = total+  Integer.parseInt(value.get(i).getText()); 
       }

         System.out.println(total);
         
         int ActualResult = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
         Assert.assertEquals(total, ActualResult);
         
//      List<WebElement> price = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/td[3]"));
//      int sum = 0;
//      for (int i=0; i<price.size(); i++) {
//    	  sum =sum + Integer.parseInt(price.get(i).getText());
//      }
//      System.out.println(sum);
      
      
      
	}

}
