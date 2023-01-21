package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDescriptionPage
{
	private WebDriver driver;
	
	public OrderDescriptionPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locator
	
	private By desc=By.id("checkout_summary_container");
	private By cancelbtn=By.id("cancel");
	private By finishbtn=By.id("finish");
	private By msg=By.xpath("//h2[contains(text(),'THANK ')]");
	
	
	//Actions
	
	public void doFinish()
	{
		System.out.println("*******Product Overview***************");
		String text=driver.findElement(desc).getText();
		System.out.println(text);
		
		driver.findElement(finishbtn).click();
		String res=driver.findElement(msg).getText();
		System.out.println(res);
	}
	
	
	public void doCancel()
	{
		driver.findElement(cancelbtn).click();
	}
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	public String getAppCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
