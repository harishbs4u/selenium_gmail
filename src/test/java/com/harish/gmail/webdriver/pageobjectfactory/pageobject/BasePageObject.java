package com.harish.gmail.webdriver.pageobjectfactory.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.harish.gmail.webdriver.common.core.*;
import com.harish.gmail.webdriver.common.core.Element.Wait;


public class BasePageObject {

	protected static WebDriver driver = DriverProvider.GetDriver(Configuration.browser);
	public final Wait wait;
	
	public BasePageObject()
	{
		this.wait = new Wait(driver);
		PageFactory.initElements(driver, this);
		

		
	}
	
	public void WaitForElementVisibleandSendkeys(WebElement element,String text)
	{
		wait.forElementVisible(element).sendKeys(text);
		
	}
	public void WaitForElementVisibleandClick(WebElement element)
	{
		wait.forElementVisible(element).click();;
		
	}
}
