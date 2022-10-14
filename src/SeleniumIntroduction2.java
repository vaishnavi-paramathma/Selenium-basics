import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumIntroduction2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
		driver.get("https://fwsa9106.freshdesk.com/support/login");
		driver.findElement(By.xpath("//section/div[1]/div/p/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("vaishnavi.paramathma@fwsa.freshworks.com");
		driver.findElement(By.name("password")).sendKeys("22082003");
		driver.findElement(By.className("css-o1ejds")).click();
		Thread.sleep(4000);
		System.out.println (driver.findElement(By.xpath("//h3[@data-test-id='quick-start-congratz']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//h3[@data-test-id='quick-start-congratz']")).getText(), "Congratulations!");
		driver.findElement(By.xpath("//div[@class='seperation']/button")).click();

	}

}
