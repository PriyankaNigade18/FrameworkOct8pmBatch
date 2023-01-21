package com.SwagLabs.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseClass
{

//	@BeforeClass
//	public void pageSetUp()
//	{
//		lp.doLogin("standard_user","secret_sauce");
//		pp.addProductToCart("Sauce Labs Backpack");
//	}
	
  @Test(enabled=false)
  public void verifyRemoveProduct() 
  {
	  ap.getCatPage();
	  ap.doRemove();
  }
  
  
  @Test(enabled=false)
  public void verifyContinueShopping() 
  {
	  ap.getCatPage();
	  ap.doContinueShopping();
  }
  
  
  @Test
  public void verifyCheckout() 
  {
	  ap.getCatPage();
	  ap.doCheckout();
  }
}
