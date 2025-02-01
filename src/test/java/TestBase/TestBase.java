package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities.WebActionUtility;

public class TestBase {
     
	public static WebDriver driver;
	
	@BeforeClass
	public void webdriverManeger()
	{
		if(driver==null)
		{
			driverInitialization();
		}
		
		driver.get("https://staging-web.wise.live");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebActionUtility.WEBElEMENT_WAIT_Duration));
		driver.manage().window().maximize();
		
	}
	
	
	
	@AfterClass
	public void teardown()
	{
		//driver.close();
	}
	
	
	

	
	public  WebDriver  driverInitialization()
	{	
		driver= new ChromeDriver();
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
}
