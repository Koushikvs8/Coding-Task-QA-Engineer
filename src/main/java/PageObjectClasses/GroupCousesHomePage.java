package PageObjectClasses;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
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
		webUtil = new WebActionUtility(driver);
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

	@FindBy(xpath = "//input[@id='input-811']")
	WebElement sessionNameInput;
	@FindBy(xpath = "//div[@role='combobox']//input")
	WebElement timeInput;
	@FindBy(xpath = "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']")
	WebElement timepickerScroll;

	WebElement schedulTime;

	@FindBy(xpath = "//div[text()='AM']")
	WebElement meridiemAM;

	@FindBy(xpath = "//div[text()='PM']")
	WebElement meridiemPM;
	@FindBy(xpath = "//span[normalize-space()='Create']")
	WebElement creatButton;

	@FindBy(xpath = "//span[contains(text(),'Conflicts')]")
	WebElement conflicts;

	@FindBy(xpath = "//span[contains(text(),'Resolve later')]")
	WebElement resolvelaterButton;

	@FindBy(xpath = "//div[@class='timeline js-track']/child::div")
	WebElement sessionCard;

	@FindBy(xpath = "//div[@class='timeline js-track']//div[@class='session-card border-radius--12 mb-4 cursor']/div/div[@class='text--18 font-weight--600 mb-2']")
	WebElement sessionName;

	@FindBy(xpath = "//div[@class='timeline js-track']//div[normalize-space()='10:00 PM']")
	WebElement sessionTime;

	@FindBy(xpath = "//div[@class='timeline js-track']//span[@class='v-chip__content']")
	WebElement upcommingStatus;

	@FindBy(xpath = "//div[normalize-space()='Wise Tester']")
	WebElement instructetNamee;

	public void clickOnAutomatedTestclassroom() throws InterruptedException {
		webUtil.click(AutomatedTestclassroom);
		Thread.sleep(1000);
	}

	public boolean displayStartSessionButton() throws InterruptedException {
		webUtil.display(startSessionButton);
		Thread.sleep(1000);
		return webUtil.display(startSessionButton);
	}

	public void clickOnliveSessionsLink() throws InterruptedException {
		webUtil.click(liveSessionsLink);
		Thread.sleep(1000);
	}

	public void clickOnscheduleSessionsButton() throws InterruptedException {
		webUtil.click(scheduleSessionsButton);
		Thread.sleep(1000);
	}

	public void clickOnAddSession() throws InterruptedException {
		webUtil.click(addSession);
		Thread.sleep(1000);
	}

	public void selectTime(String time, String meridiem) throws InterruptedException {
   try {
	   if (meridiem.equalsIgnoreCase("PM")) {
			timeInput.click();
			Thread.sleep(1000);
			timeInput.clear();
			webUtil.sendtextInput(timeInput, time);
			schedulTime = driver.findElement(By.xpath("//span[text()='" + time + "']"));
			webUtil.click(schedulTime);

			Thread.sleep(1000);


				if (webUtil.display(meridiemAM)) {

					Thread.sleep(1000);
					webUtil.click(meridiemAM);
				}
			

		} else if (meridiem.equalsIgnoreCase("AM")) {
			timeInput.click();
			timeInput.clear();
			webUtil.sendtextInput(timeInput, time);
			schedulTime = driver.findElement(By.xpath("//span[text()='" + time + "']"));
			webUtil.click(schedulTime);

			Thread.sleep(1000);
			
		
		
				// resolvelaterButton.click();
				if (meridiemPM.isDisplayed()) {
					Thread.sleep(1000);
					webUtil.click(meridiemPM);
				}
			

		}
} catch (NoSuchElementException e) {
	// TODO: handle exception
	System.out.println(e.getMessage());
}
		
		
	}

	public void clicOnCreatButton() throws InterruptedException {
		webUtil.click(creatButton);
		Thread.sleep(1000);
	}

	public boolean displaySessionCard() {
		return webUtil.display(sessionCard);
	}

	public boolean displayUpcommingstatus() {
		return webUtil.display(upcommingStatus);
	}

	public boolean displaySessionTime() {

		return webUtil.display(sessionTime);
	}

	public boolean displayInstructerName() {

		return webUtil.display(instructetNamee);
	}

	public boolean displaySessionName() {

		return webUtil.display(sessionName);
	}
}
