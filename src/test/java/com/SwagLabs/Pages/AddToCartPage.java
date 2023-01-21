package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage 
{
	private WebDriver driver;
	
	//Initialize driver
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	private By cartbtn=By.xpath("//a[@class='shopping_cart_link']");
	private By removebtn=By.xpath("//button[text()='Remove']");
	private By conbtn=By.xpath("//button[text()='Continue Shopping']");
	private By checkbtn=By.xpath("//button[text()='Checkout']");
	
	
	//Action
	
	public void getCatPage()
	{
		driver.findElement(cartbtn).click();
	}
	
	public void doContinueShopping()
	{
		driver.findElement(conbtn).click();
	}
	
	
	public void doRemove()
	{
		driver.findElement(removebtn).click();
	}
	
	public void doCheckout()
	{
		driver.findElement(checkbtn).click();
	}
	
	
	
	
	
	
	
	
	
	

}
