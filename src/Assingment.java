import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        driver.findElement(By.id("checkBoxOption1")).click();
        
         WebElement CheckBox = driver.findElement(By.id("checkBoxOption1"));
         System.out.println("The checkbox is "+ CheckBox.isSelected());
         
         Thread.sleep(3000);
         
  if (CheckBox.isSelected()) {
	  driver.findElement(By.id("checkBoxOption1")).click();
	  System.out.println("The checkbox is "+ CheckBox.isSelected());
  }
  else {
	 System.out.println("checkbox still remains checked");
  }
  
  System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
