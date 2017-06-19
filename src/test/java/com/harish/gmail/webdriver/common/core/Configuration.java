package com.harish.gmail.webdriver.common.core;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class Configuration {

	public static String file = "D:\\My Data\\Workspace\\JavaWorkspace\\selenium_gmail\\src\\main\\resources\\config.txt";
	public static Map<String, String> configdata = new HashMap<>();
	public static String HomepageURL = Getconfigvalue("HomepageURL");
	public static String chromedriverpath="src" + File.separator + "main" + File.separator + "resources" + File.separator + Getconfigvalue("chromedriverpath");
	public static String iedriverPath="src" + File.separator + "main" + File.separator + "resources" + File.separator + Getconfigvalue("IEDriverPath");
	public static String UserName = Getconfigvalue("UserName");
	public static String Password = Getconfigvalue("Password");
	public static String InvalidUserName = Getconfigvalue("InvalidUserName");
	public static String InvalidPassword=Getconfigvalue("InvalidPassword");
	public static String Autosuggestselect = Getconfigvalue("Autosuggestselect");
	public static String browser = Getconfigvalue("browser");
	
	//private static WebDriver driver = DriverProvider.GetDriver();
	
	private static Map<String, String> GetConfigdata() throws IOException
	{
		BufferedReader reader= new BufferedReader(new FileReader(file));
		

		String line = "";
		while((line = reader.readLine()) != null)
		{
			
			String split[] = line.split("=");
			configdata.put(split[0], split[1]);
		}
		return configdata;
	}
	private static String Getconfigvalue(String value)
	{
		
		if(configdata.get(value) != null)
		{
			return configdata.get(value);
		}
		else
		{
			try {
				return "null".equals(String.valueOf(GetConfigdata().get(value))) ? null : String.valueOf(GetConfigdata().get(value));
			} catch (IOException e) {
				System.out.println("here" + value);
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		return null;
	}
	
}
