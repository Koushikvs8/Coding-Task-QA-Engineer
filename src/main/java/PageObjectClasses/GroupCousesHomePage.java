package PageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utilities.WebActionUtility;

public class GroupCousesHomePage extends BasePage {

	WebActionUtility webUtil;
	public GroupCousesHomePage(WebDriver driver) {
		super(driver);
		webUtil=new WebActionUtility(driver);
		// TODO Auto-generated constructor stub
	}
	
	

	@FindBy(xpath = "//a[normalize-space()='Classroom for Automated testing']")
	WebElement AutomatedTestclassroom;
	@FindBy(xpath = "//div[@class='d-flex justify-center']//div//div//span[@class='v-btn__content']")
	WebElement startSessionButton;
	@FindBy(xpath = "//a[normalize-space()='Live Sessions']")
	WebElement liveSessionsLink;
	@FindBy(xpath = "//span[normalize-space()='Schedule Sessions']")
	WebElement scheduleSessionsButton;
	@FindBy(xpath = "//span[normalize-space()='Add session']")
	WebElement addSession;
	//span[contains(text(),'Conflicts')]
	
	//span[contains(text(),'Resolve later')]
	//SchedulingSession
	@FindBy(xpath = "//div[@role='combobox']//input")
	WebElement timeInput;
	
	WebElement schedulTime;
	
	@FindBy(xpath = "//div[text()='PM']")
	WebElement meridiem;
	@FindBy(xpath = "//span[normalize-space()='Create']")
	WebElement creatButton;
	
	public void clickOnAutomatedTestclassroom() throws InterruptedException
	{
		webUtil.click(AutomatedTestclassroom);
		Thread.sleep(1000);
	}
	
	public boolean displayStartSessionButton() throws InterruptedException
	{
		webUtil.display(startSessionButton);
		Thread.sleep(1000);
		return webUtil.display(startSessionButton);
	}
	public void clickOnliveSessionsLink() throws InterruptedException
	{
		webUtil.click(liveSessionsLink);
		Thread.sleep(1000);
	}
	public void clickOnscheduleSessionsButton() throws InterruptedException
	{
		webUtil.click(scheduleSessionsButton);
		Thread.sleep(1000);
	}
	
	public void clickOnAddSession() throws InterruptedException
	{
		webUtil.click(addSession);
		Thread.sleep(1000);
	}
	public void clickOnTimeInput() throws InterruptedException
	{
		webUtil.click(timeInput);
		Thread.sleep(1000);
	}
	public void selectTime(String time) throws InterruptedException
	{
		
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		//js.executeScript("arguments[0].scrollIntoView(true);", schedulTime);
  WebElement section = driver.findElement(By.xpath("//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']"));
      
       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.setProperty('max-height', '4000vh', 'important');", section);
        WebElement schedulTime= webUtil.getdriver().findElement(By.xpath("//div[contains(text(),'"+time+"')]"));
        Thread.sleep(1000);
        webUtil.click(schedulTime);
		Thread.sleep(1000);
	}
	
	public void clicOnCreatButton() throws InterruptedException
	{
		webUtil.click(creatButton);
		Thread.sleep(1000);
	}
}
