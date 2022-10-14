
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindEle_ID {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","/home/vaishnaviparamathma/Documents/chromedriver");
       WebDriver auto_assign = new ChromeDriver();
       auto_assign.get("https://fwsa9106.freshdesk.com");
    		   
	}

}
