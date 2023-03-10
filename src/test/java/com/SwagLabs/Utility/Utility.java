package com.SwagLabs.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	
	public static void screenshot(WebDriver driver)
	{
		 //TakesScreenshot ts=(TakesScreenshot) driver;
		  //File temp= ts.getScreenshotAs(OutputType.FILE);
		 // File dest=new File("./"+"\\Screenshots\\google.png");
		  
		  try {
			FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./"+"\\Screenshots\\SWagLabs"+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	//ExplicitWait
	public static WebElement waitForPresenceOfElement(WebDriver driver,By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitforVisibilityOfElement(WebDriver driver,By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	public static WebElement waitForElementTobeClick(WebDriver driver,By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
			
	}
	
	public static boolean waitForTitleToMatch(WebDriver driver,String title)
	{		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			return wait.until(ExpectedConditions.titleContains(title));
		
	}
	
	public static boolean waitForUrlToMatch(WebDriver driver,String url)
	{		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlContains(url));
		
	}

	
	
	
	
	//Select Based Dropdown
	public static void selectBaseddropd(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		System.out.println("Is dropdown support for multiple selection: "+dd.isMultiple());
		
		//All values
		List<WebElement> allOptions=dd.getOptions();
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}
	
	
	
	
	
	
	//JavaScriptExecutor
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
