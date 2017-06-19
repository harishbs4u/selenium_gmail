package com.harish.gmail.webdriver.pageobjectfactory.componentobject.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.harish.gmail.webdriver.common.core.Configuration;
import com.harish.gmail.webdriver.pageobjectfactory.pageobject.BasePageObject;

public class Search extends BasePageObject{
	
	@FindBy(css = "#gbqfq")
	private WebElement txtSearch;
	
	@FindBy(css ="#gbqfb")
	private WebElement btnSearch;

	@FindBy(css ="aoo.J-JN-I")
	private WebElement btnSearchoptions;
	
	public void SearchEmail(String searchword)
	{
		WaitForElementVisibleandSendkeys(txtSearch,searchword);
		
		btnSearch.click();
	}
	public void AutocompleteSearchEmail(String searchword,String Selectoption) throws InterruptedException
	{
		WaitForElementVisibleandSendkeys(txtSearch,searchword);
		AutoSuggest autosuggest = new AutoSuggest();
		autosuggest.Selectoption(Configuration.Autosuggestselect);
		Thread.sleep(2000);
		btnSearch.click();
	}
	
}
