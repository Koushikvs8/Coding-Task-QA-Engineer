package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.WebActionUtility;

public class BasePage {

	 WebDriver driver; 
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	
	
	

	
	
	
	
}
