package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage 
{
	private WebDriver driver;
	
	//Initialize driver
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Identification
	private By totalProduct=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']");
	private By addtocartbtn=By.xpath("//button[text()='Add to cart']");
	private By cartbtn=By.xpath("//a[@class='shopping_cart_link']");
	//Action
	public List<WebElement> getProductCount()
	{
		return driver.findElements(totalProduct);
	}
	
	
	public void printProductList()
	{
		List<WebElement> list=driver.findElements(totalProduct);
		System.out.println("**********Product Name**********");
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	
	
	public void addProductToCart(String pname)
	{
		//String exp="Sauce Labs Fleece Jacket";
		List<WebElement> list=driver.findElements(totalProduct);
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
				
			}
		}
		
		driver.findElement(addtocartbtn).click();
		System.out.println("Product added to cart");
		//driver.findElement(cartbtn).click();
		
	}

}
