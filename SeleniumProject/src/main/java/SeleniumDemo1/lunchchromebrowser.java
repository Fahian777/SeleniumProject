package SeleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunchchromebrowser {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahian\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");	

	//Lunch chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahian\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");

	//Creating object of Chrome driver
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//driver.get("https://www.google.com/");
	
	//Maximize browser
	driver.manage().window().maximize();
	
	
	//Get page title 
	driver.getTitle();
	
	//Print title
	System.out.println(driver.getTitle());
	
	//Implicitly wait
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//user name
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	//Entar password
	driver.findElementById("password").sendKeys("crmsfa");
	
	//Click login
	driver.findElementByClassName("decorativeSubmit").click();
	
	//Click crmsfa
	driver.findElementByLinkText("CRM/SFA").click();
	
	//Creat lead link
	
	driver.findElementByLinkText("Create Lead").click();
	
	//Enter company name
	driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	
	//Enter First name
	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");

	//enter last name
	driver.findElementById("createLeadForm_firstName").sendKeys("Mali");
	
	// enter first name local
	driver.findElementById("createLeadForm_firstName").sendKeys("H");	
	
	//enter Tital
	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
	
	//enter description
	driver.findElementById("createLeadForm_description").sendKeys("TCS");
	
	//Enter country code
	driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
	
	//Enter department
	driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
	
	//Enter Number Of Employees
	driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
	
	//Enter web url
	//driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
	
	//Enter zip code
    
    driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
    
    //Enter phone number
    
    driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");
	
	
    //Enter e-mail address
    driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
	
    //Click create lead button
	driver.findElementByClassName("smallSubmit").click();
	
	 //Print Title
	
	
	
	
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	

}
