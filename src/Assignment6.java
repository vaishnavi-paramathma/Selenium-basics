import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        
        //step-1
        driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
        //step-2
        String opt=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
        //step-3
        WebElement Staticdropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(Staticdropdown);
        dropdown.selectByVisibleText(opt);
        System.out.println( dropdown.getFirstSelectedOption().getText());
        //step-4
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(opt);
        //step-5
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        System.out.println(driver.switchTo().alert().getText());
        
        String text = driver.switchTo().alert().getText();
        if(text.contains(opt)) {
        	System.out.println("alert message success");
        }
        else {
        	System.out.println("something wrong");
        }
        
        //step-6
        driver.switchTo().alert().accept();
        
        


	}

}
