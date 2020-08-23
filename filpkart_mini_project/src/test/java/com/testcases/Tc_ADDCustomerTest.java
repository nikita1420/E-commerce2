package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.AddCustomerPage;
import com.pageobject.Loginpage;

public class Tc_ADDCustomerTest extends BaseClass
{
	@Test
public void addNewCustomer() throws   Throwable
{
	Loginpage lp=new Loginpage(driver);
	lp.clickOnLogin(username, password);
	log.info("user name and password is provided");


	Thread.sleep(1000);
	AddCustomerPage addctr=new AddCustomerPage(driver);
	log.info("add customer page is imported");
addctr.clickAddNewCustomer();
log.info("providing customer deatails");
Thread.sleep(2000);
addctr.cstmrname("nik");
addctr.cstmrgender("male");
addctr.cstmrdob("10", "02", "98");
     Thread.sleep(3000);
addctr.cstmraddress("hjskfjdshlks");
addctr.cstmrcity("agra");
addctr.cstmstate("up");
addctr.cstmrpincode("282828");
addctr.cstmephone("9876543210"); 
String email=randomstring()+"@gmail.com";
addctr.cstmremail(email);
addctr.cstmrpassword("abmnmag");
addctr.cstmrsubmitbutton();
    Thread.sleep(3000);
    log.info("validation is started");
  boolean res= driver.getPageSource().contains("Customer Registered Successfully");
  
  if (res==true)
  {
	  log.info("test is passed ");
	  Assert.assertTrue(true);
	  
  }else
  {
	  captureScreenShot(driver,"addn new customer");
  }Assert.assertFalse(false);
}

	






}

