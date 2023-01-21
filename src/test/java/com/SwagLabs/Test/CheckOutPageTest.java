package com.SwagLabs.Test;

import org.testng.annotations.Test;

public class CheckOutPageTest extends BaseClass
{
  @Test
  public void verfiyCheckout() 
  {
	  cp.doContinue("Priyanka", "Nigade", "411014");
  }
}
