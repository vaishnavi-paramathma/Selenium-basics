import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
		
        WebElement footerDriver =  driver.findElement(By.id("gf-BIG"));
        
        System.out.println( footerDriver.findElements(By.tagName("a")).size());
        
        WebElement ColumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
        System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
        
        for(int i=1; i<ColumnDriver.findElements(By.tagName("a")).size(); i++) {
        	
        	String clickLinkTab = Keys.chord(Keys.CONTROL , Keys.ENTER);
        	ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab); 
        	
        }
        	Set<String> abc = driver.getWindowHandles();
        	Iterator<String> it =  abc.iterator();
        
        	while(it.hasNext()) {
        		driver.switchTo().window(it.next());
        		System.out.println(driver.getTitle());
        		
        	}
        	
        	
	

	}
	
}
