package com.harish.gmail.webdriver.pageobjectfactory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.harish.gmail.webdriver.common.core.Element.*;

import com.harish.gmail.webdriver.pageobjectfactory.pageobject.BasePageObject;

public class PasswordPage extends BasePageObject{
	@FindBy(css = "input[name=password]")
	public WebElement txtPass;
	
	@FindBy(css ="span.RveJvd.snByac")
	public WebElement btnsignIn;
	
	public PasswordPage()
	{
		super();
	}
	
	public void Passwordas(String password)
	{
		
		WaitForElementVisibleandSendkeys(txtPass,password);
		
		btnsignIn.click();
	}
}
