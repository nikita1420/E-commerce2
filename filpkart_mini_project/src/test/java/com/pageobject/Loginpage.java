package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
//hello this is verion one
	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	@FindBy(name="uid") WebElement  username;
	@FindBy(name="password") WebElement  password;
	@FindBy(xpath="//input[@name='btnLogin']") WebElement  clickbtn;
	
	public void clickOnLogin(String uname,String upass)
	{
		username.sendKeys(uname);
		password.sendKeys(upass);
		clickbtn.click();
		
	}
	
	
	
	
}
