package com.harish.gmail.webdriver.testcases.search;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.harish.gmail.webdriver.common.core.Configuration;
import com.harish.gmail.webdriver.pageobjectfactory.componentobject.search.*;
import com.harish.gmail.webdriver.pageobjectfactory.login.LoginPage;;

public class EmailSearch {

	@BeforeTest
	public void setup() throws InterruptedException
	{
		
		LoginPage loginpage = new LoginPage();
		
		loginpage.Loginas(Configuration.UserName, Configuration.Password);
	}
	@Test
	public void SearchaText()
	{
		System.out.println("Searchxt");;

		Search search = new Search();
		search.SearchEmail(Configuration.UserName);
	}
	@Test
	public void AutoCompleteSelect() throws InterruptedException
	{
		System.out.println("Search");;

		Search search = new Search();
		search.AutocompleteSearchEmail(Configuration.UserName.substring(0, 2),Configuration.Autosuggestselect);
		
				
	}
}
