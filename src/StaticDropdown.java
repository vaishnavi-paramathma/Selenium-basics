import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement StaticDropdown  =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select Dropdown =new Select(StaticDropdown);
        Dropdown.selectByIndex(1);
        System.out.println (Dropdown.getFirstSelectedOption().getText());
        Thread.sleep(3000);
        Dropdown.selectByVisibleText("USD");
        System.out.println( Dropdown.getFirstSelectedOption().getText());
        Dropdown.selectByValue("AED");
        System.out.println( Dropdown.getFirstSelectedOption().getText());
      
	}

}
