import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait w =new WebDriverWait(driver,5);
        
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
        String[] productName= {"Brocolli - 1 Kg","Cauliflower - 1 Kg","Cucumber - 1 Kg"};

        //driver.findElement(By.xpath("//h4[text()='Brocolli - 1 Kg']//following-sibling::div[2]/button[text()='ADD TO CART']")).click();  
        for(int i=0; i<productName.length; i++) {
        	System.out.println(productName[i]);
        driver.findElement(By.xpath("//h4[text()='"+productName[i]+"']//following-sibling::div[2]/button[text()='ADD TO CART']")).click(); 
        
          }
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='cart-icon']//img")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//input")).sendKeys("rahulshettyacademy");
        
        //Thread.sleep(2000);
        driver.findElement(By.className("promoBtn")).click();
        //Thread.sleep(2000);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoInfo']")));
        
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        //Thread.sleep(1000);
        driver.findElement(By.className("chkAgree")).click();
        
        driver.findElement(By.xpath("//*[text()='Proceed']")).click();
        
	}
}
