package com.SwagLabs.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OrderDescriptionPageTest extends BaseClass
{
  @Test(priority=2)
  public void verifyTitle()
  {
	  String exp="Swag";
	  if(op.getAppTitle().contains(exp))
	  {
		  System.out.println("Title is matching");
	  }else
	  {
		  System.out.println("Title is not matching");
	  }
	  
	  
  }
  
  @Test(priority=1)
  public void verifyCurrentUrl()
  {
	  String exp="demo";
	  if(op.getAppCurrentUrl().contains(exp))
	  {
		  System.out.println("Url is correct!");
	  }else
	  {
		  System.out.println("Url is incorrect!");
	  }
  }
  
  @Test(priority=3)
  public void verifyOrder()
  {
	  op.doFinish();
  }
  
  
  
}
