package com.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.Loginpage;

public class TC_loginTest extends BaseClass
{
	@Test
public void loginTest() throws IOException
{
	//driver.get(baseurl);
	//driver.manage().window().maximize();
	log.info("URL is opened");
	
	Loginpage lp=new Loginpage(driver);
	lp.clickOnLogin(username, password);
	log.info("login is done");  
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		
		Assert.assertTrue(true);
		log.info("login test passed");
	}
	else
	{
		captureScreenShot( driver,"logintest");
		Assert.assertTrue(false);
	log.info("login test fail");
    }

}}