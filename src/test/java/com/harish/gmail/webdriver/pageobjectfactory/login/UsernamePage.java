package com.harish.gmail.webdriver.pageobjectfactory.login;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import com.harish.gmail.webdriver.pageobjectfactory.pageobject.BasePageObject;

public class UsernamePage extends BasePageObject{
	
	//private WebDriver driver;
	@FindBy(css ="input#identifierId")
	public WebElement txtUsername;
	
	@FindBy(css ="span.RveJvd.snByac")
	public WebElement btnNext;
	
	@FindBy(css ="span#errormsg_0_Email")
	public WebElement divError;
	
	public UsernamePage()
	{
		super();
	}
	
	public void UserNameas(String username)
	{
		txtUsername.clear();
		txtUsername.sendKeys(username);
		btnNext.click();
	}
	public String getErrorMessage()
	{
		return wait.forElementVisible(divError).getText();
	}
	
	public Boolean ValidateErrorMessage(String Errormessage)
	{
		return Errormessage.equals(getErrorMessage());
	}
}
