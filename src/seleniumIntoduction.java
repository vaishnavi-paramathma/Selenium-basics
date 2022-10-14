import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumIntoduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
		driver.get("https://fwsa9106.freshdesk.com/support/login");
		//driver.findElement(By.className("fw-twitter-btn py-12 rounded")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//section/div[1]/div/p/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("vaishnavi@fwsa.freshworks.com");
		driver.findElement(By.name("password")).sendKeys("22082003");
		driver.findElement(By.className("css-o1ejds")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='server-error-message']//span[2]")).getText()); 
		driver.findElement(By.xpath("//span[@class='css-1reitxh-LinkText']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@class='css-9ic2m1-Link']")).click();
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vaishnavi.paramathma@fwsa.freshworks.com");
		driver.findElement(By.id("password")).sendKeys("22082003");
		driver.findElement(By.cssSelector("button[type*='sub']")).click();
		
		
		//System.out.println(driver .getTitle());
		//System.out.println(driver.getCurrentUrl());
        //driver.close();
		//driver.quit();
		
		
	}

}
