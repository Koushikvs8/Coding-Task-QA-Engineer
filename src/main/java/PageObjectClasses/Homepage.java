package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.WebActionUtility;

public class Homepage extends BasePage {
	WebDriver driver;
	WebActionUtility webUtil;
	public Homepage(WebDriver driver) {
		super(driver);
		webUtil=new WebActionUtility(driver);
		// TODO Auto-generated constructor stub
	}
	//span[normalize-space()='Group courses']
	@FindBy(xpath = "//div[@class='name text--24 font-weight--600 ml-3']")
	WebElement instituteName;
	@FindBy(xpath = "//span[normalize-space()='Group courses']")
	WebElement groupCoursesLink;
	@FindBy(xpath = "//span[@class='d-flex justify-space-between align-center']")
	WebElement accountButton;
	@FindBy(xpath = "//div[contains(text(),'Logout')]")
	WebElement logOut;
	
	public boolean displayInstitutename() 
	{  boolean status= instituteName.isDisplayed();
		return status;
	}
	public void clickOngroupCoursesLink() throws InterruptedException 
	{   webUtil.click(groupCoursesLink);
	    Thread.sleep(1000);
	}
	
	public void clickOnLogout() throws InterruptedException 
	{   webUtil.click(accountButton);
	    Thread.sleep(1000);
	    webUtil.click(logOut);
	}
}
