package com.testcases;


import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;
import com.utilities.ReadConfig;

public class BaseClass
{
	ReadConfig readconfig= new ReadConfig();
public String baseurl=readconfig.getApplicationUrl();
public String username=readconfig.getUsername();
public String password=readconfig.getPassword();
public static WebDriver driver;
public static Logger log;


@Parameters("browser")
 @BeforeClass
public void setUp( String br)
{
	
	 log=Logger.getLogger("Ebanking");
	PropertyConfigurator.configure("Log4j.properties");
	
	if(br.equalsIgnoreCase("chrome"))
    {
	    System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
	    driver=new ChromeDriver();
	}
	else if(br.equalsIgnoreCase("firefox"))
	{
       System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
       driver=new FirefoxDriver();
    }
	driver.get(baseurl);
	driver.manage().window().maximize();
}

@AfterClass
public void tearDown()

{
	
driver.quit();
}

public void  captureScreenShot(WebDriver driver,String screenshotname) throws IOException 
{
	 TakesScreenshot ts= (TakesScreenshot)driver;
     File src=	ts.getScreenshotAs(OutputType.FILE);
  String   destination=(System.getProperty("user.dir")+"/ScreenShots/"+screenshotname+".png");
  
       Files.copy(src, new File(destination));


   }
public String randomstring()
{
	
String genratedstring=RandomStringUtils.randomAlphabetic(8);
return(genratedstring);

}
public static String randomstring2()
{
	
String genratedstring2=RandomStringUtils.randomAlphabetic(5);
return(genratedstring2);

}
}


