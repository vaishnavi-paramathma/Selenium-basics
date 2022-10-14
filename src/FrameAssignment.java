import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//        
//        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
//        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
//       
//        System.out.println( driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
        
        
        driver.get("http://the-internet.herokuapp.com/");



        driver.findElement(By.linkText("Nested Frames")).click();



        driver.switchTo().frame("frame-top");



        driver.switchTo().frame("frame-middle");



        System.out.println(driver.findElement(By.id("content")).getText());


	}

}
