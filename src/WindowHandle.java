import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows =  driver.getWindowHandles();
        Iterator<String>it = windows.iterator();
        String ParentId = it.next();
        String ChildId = it.next();
        driver.switchTo().window(ChildId);
        System.out.println(driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText());
        String emailId =  driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
        driver.switchTo().window(ParentId);
        driver.findElement(By.cssSelector("#username")).sendKeys(emailId);
        
	}

}
