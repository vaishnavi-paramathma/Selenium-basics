import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        
       
//        System.out.println( driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//        System.out.println( driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
        
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        
       driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(3000);
       System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
        
        
        //  driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_rbtnl_Trip_1']")).click();
        //driver.findElement(By.id("hrefIncAdt")).click();
        
        /*int i=1;
        while(i<4) {
        	driver.findElement(By.id("hrefIncAdt")).click();
        	i++;
        }*/
        
       for(int i = 1;i<4;i++) {
    	   driver.findElement(By.id("hrefIncAdt")).click();
       }
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());        
        
        
        

	}

}
