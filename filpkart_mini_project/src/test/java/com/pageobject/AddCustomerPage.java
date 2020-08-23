package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage 
{
	WebDriver ldriver;
public AddCustomerPage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	
}

@FindBy(xpath="html/body/div[3]/div/ul/li[2]/a") WebElement addcstmer;
@FindBy(xpath="//input[@name='name']") WebElement name;
@FindBy(name="rad1") WebElement gender;
@FindBy(id="dob") WebElement dob;
@FindBy(name="addr") WebElement address;
@FindBy(name="city") WebElement city;
@FindBy(name="state") WebElement state;
@FindBy(name="pinno") WebElement pinno;
@FindBy(name="telephoneno") WebElement phone;
@FindBy(name="emailid") WebElement email;
@FindBy(name="password") WebElement password;
@FindBy(name="sub") WebElement submitbtn;


public void clickAddNewCustomer()
{
	addcstmer.click();
	
}
public void cstmrgender(String cgender)
{
	gender.click();
	
}
public void cstmrname(String ctmrname)
{
	name.sendKeys(ctmrname);
}
public void cstmrdob(String mm,String dd,String yy)
{
	dob.sendKeys(mm);
	dob.sendKeys(dd);
	dob.sendKeys(yy);
	
}
public void cstmraddress(String add)
{
	address.sendKeys(add);
}

public void cstmstate(String cstate)
{
	state.sendKeys(cstate);
	
}

public void cstmrpincode(String pinnum)
{
	pinno.sendKeys(String.valueOf(pinnum));
	
}
public void cstmephone(String phoneno)
{
	phone.sendKeys(phoneno);
	
}
public void cstmremail(String mail)
{
	email.sendKeys(mail);
	
}
public void cstmrpassword(String pass)
{
	password.sendKeys(pass);
	
}
public void cstmrsubmitbutton()
{
	submitbtn.click();
	
}
public void cstmrcity(String custcity)
{
	
	city.sendKeys(custcity);
}
}
