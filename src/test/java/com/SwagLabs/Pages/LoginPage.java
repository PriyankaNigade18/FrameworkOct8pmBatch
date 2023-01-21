package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	//Encapsulation
	private WebDriver driver;
	
	
	//Initialize current class driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Identify By locator
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By lbtn=By.id("login-button");
	
	
	//Action
	
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(lbtn).click();
	}
	
	
	public String getAppCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	

}
