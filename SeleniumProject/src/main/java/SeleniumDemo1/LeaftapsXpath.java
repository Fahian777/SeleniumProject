package SeleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahian\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Enter username/password,and click login button
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@value='Login']").click();

		// click create lead button,create lead form page
		
		driver.findElementByXPath("//div[@id='label']/a").click();
		driver.findElementByXPath("//a[text()=Create Lead]").click();
		
		//enter Data
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Aziz");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		
		
		
	}

}
