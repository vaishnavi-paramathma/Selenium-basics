import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        //hit the url
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        //boarding point
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        
        //dropping point
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2])")).click();
        
        //calendar
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-today")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
        	 System.out.println("Its enabled");	
        }
        else {
        	System.out.println("Its not enabled");
        }
        
        
        //check the senior citizen checkbox
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        
        
        //passanger input
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(3000);         
        for(int i = 1;i<4;i++) {
     	   driver.findElement(By.id("hrefIncAdt")).click();
        }
         driver.findElement(By.id("btnclosepaxoption")).click(); 
         System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
      
         
         //currency dropdown 
         Thread.sleep(3000);
         WebElement StaticDropdown  =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
         Select Dropdown =new Select(StaticDropdown);
         Dropdown.selectByVisibleText("USD");
         System.out.println( Dropdown.getFirstSelectedOption().getText());
         
         //search button
         driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
         
         
	}

}
