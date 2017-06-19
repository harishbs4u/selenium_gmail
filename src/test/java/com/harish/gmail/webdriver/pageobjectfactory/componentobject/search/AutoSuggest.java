package com.harish.gmail.webdriver.pageobjectfactory.componentobject.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import com.harish.gmail.webdriver.pageobjectfactory.pageobject.BasePageObject;

public class AutoSuggest extends BasePageObject{

	@FindBy(css = "gssb_m")
	public WebElement tblAutocomplete;
	
	public List<WebElement> GetAllListElements ()
	{
		wait.forElementVisible(tblAutocomplete);
		List <WebElement> SelectOptions = tblAutocomplete.findElements(By.tagName("tr"));
		
		return SelectOptions;
	}
	
	public void Selectoption(String text)
	{
		List <WebElement> elements = GetAllListElements();
		for(WebElement element:elements)
		{
			if(element.equals(text))
			{
				element.click();
			}
		}
	}
	
}
