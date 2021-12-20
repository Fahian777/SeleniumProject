package SeleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CofirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\eclipse-workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElementByLinkText("AGENT LOGIN").click();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		driver.findElementByXPath("//input[@id='password'").sendKeys("crmsfa");

	driver.findElementByXPath("//input[@value='login']").click();
	driver.findElementByLinkText("CRM/SFA").click();
	
	//Example of Text base XPath

	driver.findElementByXPath("//a[text()='Merge']").click();
	String ConfirmAlert = driver.switchTo().alert().getText();
	//String ConfirmAlertText = driver.switchTo().alert().getText();
			System.out.println(ConfirmAlert);
	
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			//driver.switchTo().alert().dismiss();

			driver.close();
	
	
}
}
	
