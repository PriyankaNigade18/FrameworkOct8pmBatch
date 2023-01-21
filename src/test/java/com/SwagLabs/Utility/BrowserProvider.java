package com.SwagLabs.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserProvider 
{
	public static WebDriver driver;
	
	public static WebDriver browserSetup(String bname)
	{
		
		if(bname.equalsIgnoreCase("chrome"))
		  {
			  driver=new ChromeDriver();
			  
			  
		  }else if(bname.equalsIgnoreCase("edge"))
		  {
			  driver=new EdgeDriver();
			  
		  }else if(bname.equalsIgnoreCase("firefox"))
		  {
			  driver=new FirefoxDriver();
			  
		  }
		driver.get(PropFile.getData("url"));
		return driver;
	}
	
	
	
	

}
