package com.harish.gmail.webdriver.common.core.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public Wait(WebDriver driver)
	{
		this.driver = driver;
		 this.wait = new WebDriverWait(driver, 15);
	}
	
	public WebElement forElementVisible(WebElement element )
	{
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public WebElement forElementClickable(WebElement element)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
