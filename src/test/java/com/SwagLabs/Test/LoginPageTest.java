package com.SwagLabs.Test;

import org.testng.annotations.Test;

import com.SwagLabs.Pages.LoginPage;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyCurrentUrl()
  { 
	  String curl=lp.getAppCurrentUrl();
	  System.out.println(curl);
  }
  
  @Test(priority=2)
  public void verifyLogin()
  {
	lp.doLogin("standard_user","secret_sauce"); 
  }
  
  
  
  
  @Test(priority=3)
  public void verifyPageTitle()
  {
	 System.out.println(lp.getAppTitle());
  }
}

