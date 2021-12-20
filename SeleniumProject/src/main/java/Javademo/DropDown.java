package Javademo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
	//Lunch Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahian\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	//Load URL
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//Maximize browser window
	driver.manage().window().maximize();
	
	//Implicitly wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	
	//Print current title
			System.out.println(driver.getTitle());

			//Enter Username 
			driver.findElementById("username").sendKeys("DemoSalesManager");

			//Enter Password - (Element level)
			driver.findElementById("password").sendKeys("crmsfa");

			// Click Login Button 
			driver.findElementByClassName("decorativeSubmit").click();

			// click crm.sfa link
			driver.findElementByLinkText("CRM/SFA").click();

			//click create lead link
			driver.findElementByLinkText("Create Lead").click();

			// company name
			driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

			// enter firstName						
			driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");

			// enter lastName
			driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
			// driver.findElementById("createLeadForm_lastName").sendKeys("J");
	
		
		//Select sources-(Dropdown)
			////WebElement src =
			driver.findElementById("createLeadForm_dataSourceId");
			
			//Select Source dropdown and store it in src variable
			WebElement src = 
			driver.findElementById("createLeadForm_dataSourceId");
			
			//create object of Select class and pass the src variable into it.
			Select dd = new Select(src);
			
			//dd.selectByVisibleText("Employee"); //way-1
			//dd.selectByValue("LEAD_PARTNER"); //way-2
			dd.selectByIndex(11); //way-3
			
			//Select Industry
			WebElement Ind = 
			driver.findElementById("createLeadForm_industryEnumId");
			
		Select dd1 = new Select(Ind);
		dd1.selectByVisibleText("Fianace");
		
		//Select Marketing
				WebElement mkt = driver.findElementById("createLeadForm_marketingCampaignId");
				Select dd2 = new Select(mkt);
				dd2.selectByIndex(2); //way-3
		
		
		
		

	}

}