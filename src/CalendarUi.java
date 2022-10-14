import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
       
//        System.out.println( driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_rbtnl_Trip_1']")).isEnabled());
//        
//        System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
//        driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_rbtnl_Trip_1']")).click();
//        System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
//        
//        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
//        	 System.out.println("Its enabled");
//        	
//        }
//        else {
//        	System.out.println("Its not enabled");
//        }
//        	
//        	
//        driver.findElement(By.id("divpaxinfo")).click();

        
         
         
//        System.out.println( driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_rbtnl_Trip_1']")).isEnabled());
         
         
 		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        
        
       driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(3000);
     
        
       for(int i = 1;i<4;i++) {
    	   driver.findElement(By.id("hrefIncAdt")).click();
       }
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());        

	}

}
