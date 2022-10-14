import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		Set<String> windows =  driver.getWindowHandles();
        Iterator<String>it = windows.iterator();
        String ParentId = it.next();
        String ChildId = it.next();
        driver.switchTo().window(ChildId);
		
        System.out.println( driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
         
        driver.switchTo().window(ParentId);
        System.out.println( driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
        
        
	}

}
