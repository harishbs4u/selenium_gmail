package com.harish.gmail.webdriver.common.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverProvider {
	
	public static WebDriver driver;
	
	public static WebDriver GetDriver(String browser)
	{
		if(browser.equals("CHROME"))
		{
			return GetChromeDriver();
		}
		else if(browser.equals("IE"))
		{
			return GetIEDriver();
		}
		else if(browser.equals("FIREFOX"))
		{
			return GetFirefoxDriver();
		}
		return null;
		
	}
	
	public static WebDriver GetChromeDriver()
	{
			System.setProperty("webdriver.chrome.driver",Configuration.chromedriverpath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Configuration.HomepageURL);
			
			return driver;
		
	}
	public static WebDriver GetFirefoxDriver()
	{
		
		
		return driver;
		
		
	}
	public static WebDriver GetIEDriver()
	{
		System.out.println("*******************");
		System.out.println("launching IE browser");
		System.setProperty("webdriver.ie.driver",Configuration.iedriverPath);
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(Configuration.HomepageURL);
		
		return driver;		
	}
	//To DO Create a function for driver properties.
}
