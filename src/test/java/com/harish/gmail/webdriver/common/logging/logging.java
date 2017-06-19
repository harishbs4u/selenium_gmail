package com.harish.gmail.webdriver.common.logging;

import java.io.File;

import org.openqa.selenium.WebDriver;

public class logging {
	  private static String reportPath = "." + File.separator + "logs" + File.separator;
	  private static String screenDirPath = reportPath + "screenshots" + File.separator;
	  private static String screenPath = screenDirPath + "screenshot";
	  private static String logFileName = "log.html";
	  private static String logPath = reportPath + logFileName;
	  
	  public static void log(String command, String description, boolean success, WebDriver driver) 
	  {
		  
	  }
}
