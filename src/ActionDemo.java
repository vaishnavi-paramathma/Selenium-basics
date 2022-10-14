import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Actions a =new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().doubleClick().keyDown(Keys.SHIFT).sendKeys("sticker").build().perform();
        a.moveToElement(move).contextClick().build().perform();
     
	}

}
