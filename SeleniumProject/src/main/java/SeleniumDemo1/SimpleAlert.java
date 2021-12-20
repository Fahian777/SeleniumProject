package SeleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahian\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe" );
	
	ChromeDriver driver = new ChromeDriver();

	driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do-");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
	//driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
	
	//switch control to Alert from HTML page and get the Alert text
	
	String SimpleAlertText = driver.switchTo().alert().getText();
	System.out.println(SimpleAlertText);
	
	//String SimpleAlertText = driver.switchTo().alert().getText();
			//System.out.println(SimpleAlertText);
	
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	}

}
