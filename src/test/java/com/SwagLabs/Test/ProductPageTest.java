package com.SwagLabs.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseClass
{
//	@BeforeClass
//	public void pageSetUp()
//	{
//		lp.doLogin("standard_user","secret_sauce");
//	}
	
	
  @Test(priority=1)
  public void verfiyProductsCount()
  {
	  System.out.println("Product count is:"+pp.getProductCount().size());
	  
  }
  
  @Test(priority=2)
  public void verifyProductList()
  {
	  pp.printProductList();
  }
  
  @Test(priority=3)
  public void verifyProductAddedToCart()
  {
	  pp.addProductToCart("Sauce Labs Fleece Jacket");
  }
}
