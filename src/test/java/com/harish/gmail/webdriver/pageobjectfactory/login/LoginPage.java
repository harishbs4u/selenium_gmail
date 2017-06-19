package com.harish.gmail.webdriver.pageobjectfactory.login;

import com.harish.gmail.webdriver.common.core.Configuration;
import com.harish.gmail.webdriver.pageobjectfactory.pageobject.BasePageObject;
 
public class LoginPage extends BasePageObject{
	
	public LoginPage()
	{
		super();
		System.out.println("Setup2");;
	}
	
	public void Loginas(String username,String password) throws InterruptedException
	{
		UsernamePage userpage = new UsernamePage();
		//Thread.sleep(5000);
		userpage.UserNameas(username);
		PasswordPage passpage = new PasswordPage();
		passpage.Passwordas(password);
		
	}
	
}
