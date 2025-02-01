package PageObjectClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.WebActionUtility;

public class LoginAndSignUpPage extends BasePage {
	WebDriver driver;
	WebActionUtility webUtil;
	Homepage getstartedhomepage;
	public LoginAndSignUpPage(WebDriver driver) {
		super(driver);
		webUtil=new WebActionUtility(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "//div[@class='text-center mt-9']//div")
	WebElement loginText;
	@FindBy(xpath = "//span[normalize-space()='Continue with Mobile']")
	WebElement continueWthMobileButton;
	@FindBy(xpath = "//input[@placeholder=\"Phone number\"]")
	WebElement phoneNumInput;
	@FindBy(xpath = "//span[contains(text(),'Get OTP')]")
	WebElement otpButton;
	@FindBy(xpath = "//div[@class=\"v-text-field__slot\"]//input[contains(@id, 'input-')]")
	List<WebElement> otpElements;
	@FindBy(xpath = "//span[normalize-space()='Verify']")
	WebElement varifyButton;
	
	public void clickLogin() throws InterruptedException
	{
		webUtil.click(loginText);
		Thread.sleep(1000);
	}
	
	public void clickOnContinueWthMobileButton() throws InterruptedException
	{
		webUtil.click(continueWthMobileButton);
		Thread.sleep(1000);
	}
	
	public void EnterPhoneNum() throws InterruptedException
	{
		webUtil.sendtextInput(phoneNumInput, "1111100000");
		Thread.sleep(1000);
	}
	public void clickOnGetOtp() throws InterruptedException
	{
		webUtil.click(otpButton);
		Thread.sleep(1000);
	}
   
	public void EnterOtpNum() throws InterruptedException
	{
		webUtil.sendtextInputs(otpElements, "0000");
		Thread.sleep(1000);
	}
	
	public Homepage clickOnVarifyButton() throws InterruptedException
	{
		webUtil.click(varifyButton);
		Thread.sleep(1000);
		return new Homepage(driver);
		
	}
	
}
