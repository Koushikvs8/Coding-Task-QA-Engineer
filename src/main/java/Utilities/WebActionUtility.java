package Utilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectClasses.BasePage;

public class WebActionUtility   {
	WebDriver driver;
	public final static int WEBElEMENT_WAIT_Duration=10;
	
	public WebActionUtility(WebDriver driver) {
		this.driver=driver;
	  // TODO Auto-generated constructor stub
	}
	
	public void sendtextInput(WebElement element , String sentkeys)
	{
		WebElement Waitedwebelement=WaitByVisibility(element);
		Waitedwebelement.clear();
		Waitedwebelement.sendKeys(sentkeys);
	
	}
	public void sendtextInputs(List<WebElement> element, String sentkeys)
	{      
		for (int i = 0; i < element.size(); i++) {
			element.get(i).sendKeys(sentkeys.charAt(i)+"");
		}
		
	
	}
	
	
	public void click(WebElement element)
	{
		WebElement Waitedwebelement=WaitByVisibility(element);
		Waitedwebelement.click();
		
		
		
	}
	public boolean display(WebElement element)
	{  
		WebElement Waitedwebelement=WaitByVisibility(element);
		boolean status=Waitedwebelement.isDisplayed();
		
		return status;
	}

	 
	public WebElement WaitByVisibility(WebElement element)
	{    WebElement webelement=null;
		try {
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(WEBElEMENT_WAIT_Duration));
		      webelement=wait.until(ExpectedConditions.visibilityOf(element));  
		    return webelement;  
		} catch (Exception e) {
			System.out.println("Element wait exeeded then limit : element not visible");
		}
		return webelement;
		 
	}

	public WebDriver getdriver()
	{
		return driver;
	}

	
	
	
    
}
