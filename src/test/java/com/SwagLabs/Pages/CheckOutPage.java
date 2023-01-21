package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage 
{
	private WebDriver driver;
	
	//initialize driver
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locator
	private By firstname=By.id("first-name");
	private By lastname=By.id("last-name");
	private By zipcode=By.id("postal-code");
	private By cancelbtn=By.id("cancel");
	private By continuebtn=By.id("continue");
	
	
	
	//Actions
	public void doContinue(String fname,String lname,String zcode)
	{
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zcode);
		System.out.println("First name , Last name and Zip code has Entered!");
		driver.findElement(continuebtn).click();
	}
	
	
	public void doCancel()
	{
	driver.findElement(cancelbtn).click();	
	}
	
	
	public void doCancel(String fname,String lname,String zcode)
	{
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zcode);
		System.out.println("First name , Last name and Zip code has Entered!");
	driver.findElement(cancelbtn).click();	
	}
	
	
	
	
	
	
	
	
}
