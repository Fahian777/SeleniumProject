package SeleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahian\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");	
		
	WebDriver driver = new ChromeDriver();
	
	//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
		
		System.out.println(driver.getTitle());
		
driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		
	/*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());*/	
		
		
		
		
		
		
		
		
		
		
		

	}

}
