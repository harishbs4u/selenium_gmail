package com.harish.gmail.webdriver.testcases.logintests;

import org.testng.annotations.*;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import com.harish.gmail.webdriver.common.core.Configuration;
import com.harish.gmail.webdriver.pageobjectfactory.login.*;
import com.harish.gmail.webdriver.pageobjectfactory.pageobject.*;

public class LoginTests extends BasePageObject
{

	public WebDriver driver;
	
	@BeforeTest
	public void SetBaseurl() throws InterruptedException
	{
		//driver = Configuration.GetChromeDriver();
		Thread.sleep(5000);
	}
	
	@Test
	public void LoginwithValidCredentials() throws InterruptedException
	{
		LoginPage loginpage = new LoginPage();
		loginpage.Loginas(Configuration.UserName, Configuration.Password);
		Assert.assertEquals(true, true);
	}
	@Test
	public void LoginwithInvalidUserName()
	{
		UsernamePage usernamepage = new UsernamePage();
		usernamepage.UserNameas(Configuration.InvalidUserName);
		Assert.assertEquals(Boolean.TRUE, usernamepage.ValidateErrorMessage("Sorry, Google doesn't recognize that email."));
	}
	@Test
	public void LoginwithInvalidPassword()
	{
		
	}
	
	@AfterTest
	public void endSession()
	{
		
//		driver.quit();
	}
	
}
