package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectClasses.GroupCousesHomePage;
import PageObjectClasses.Homepage;
import PageObjectClasses.Homepage;
import PageObjectClasses.LoginAndSignUpPage;
import TestBase.TestBase;

public class CreatingAndSchedulingSessionTest1 extends TestBase   {

	
	//WebDriver driver;
	LoginAndSignUpPage login;
	Homepage homepage;
	GroupCousesHomePage groupCourseHompage;
	
	
	@Test(priority = 0)
	public void Perform_login_as_tutor() throws InterruptedException
	{
	     login=new LoginAndSignUpPage(driver);
	     
		 login.clickLogin();
		 login.clickOnContinueWthMobileButton();
		 login.EnterPhoneNum();
		 login.clickOnGetOtp();
		 login.EnterOtpNum();
		 login.clickOnVarifyButton();
		
		 //Assert that the institute name “Testing Institute” is showing up
		 homepage =new Homepage(driver);
		 boolean status= homepage.displayInstitutename();
		 Assert.assertTrue(status);
	}
	
	@Test(priority = 1)
	public void verify_opening_of_existing_class_functionality() throws InterruptedException
	{   
		
		homepage.clickOngroupCoursesLink();
		groupCourseHompage=new GroupCousesHomePage(driver);
	    groupCourseHompage.clickOnAutomatedTestclassroom();
	    
	    //Assert that classroom is opened successfully
	    boolean status=groupCourseHompage.displayStartSessionButton();
	    Assert.assertTrue(status);
		
	}
	@Test(priority = 2)
	public void verify_SchedulingSession_for_class_functionality() throws InterruptedException
	{
		groupCourseHompage.clickOnliveSessionsLink();
		groupCourseHompage.clickOnscheduleSessionsButton();
		groupCourseHompage.clickOnAddSession();
		
		groupCourseHompage.selectTime("10:00" , "PM");
		groupCourseHompage.clicOnCreatButton();
		//Assert the session
		Boolean status= groupCourseHompage.displayStartSessionButton();
		Assert.assertTrue(status);
	}
/*
 * ● Assert the session
○ On the classroom home screen assert that sessions card is shown on the
timeline
○ Assert the session details such as instructor name, session name, session
time, upcoming status, etc
 * 
 */

	
	
	
	
	
}
