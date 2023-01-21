package com.SwagLabs.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utility.*;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public ProductPage pp;
	public AddToCartPage ap;
	public CheckOutPage cp;
	public OrderDescriptionPage op;
	public PropFile p;
	public ExcelUtil excel;
	public Utility utl;

	@BeforeTest
	public void setUp()
	{
		p=new PropFile();
		
//		driver=new ChromeDriver();
//		driver.get(PropFile.getData("url"));
		driver=BrowserProvider.browserSetup(PropFile.getData("bname"));
		lp=new LoginPage(driver);
		pp=new ProductPage(driver);
		ap=new AddToCartPage(driver);
		cp=new CheckOutPage(driver);
		op=new OrderDescriptionPage(driver);
		excel=new ExcelUtil();
		utl=new Utility();
		
		
	}
	
	@BeforeClass
	public void pageSetUp()
	{
		//lp.doLogin(PropFile.getData("uname"),PropFile.getData("psw"));
		
		lp.doLogin(ExcelUtil.getFileData(0,0),ExcelUtil.getFileData(0,1));
		staticWait();
		Utility.screenshot(driver);
		pp.addProductToCart(PropFile.getData("pname"));
		staticWait();
		Utility.screenshot(driver);
		ap.getCatPage();
		staticWait();
		Utility.screenshot(driver);
		ap.doCheckout();
		staticWait();
		Utility.screenshot(driver);
		cp.doContinue(PropFile.getData("fname"),PropFile.getData("lname"),PropFile.getData("zcode"));
		staticWait();
		Utility.screenshot(driver);
	}
	
	
	
	public void staticWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
