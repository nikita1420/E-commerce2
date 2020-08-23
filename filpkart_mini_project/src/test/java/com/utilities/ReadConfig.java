package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig 
{
Properties pro;
public ReadConfig()
{
	File src= new File("./Configuration/config.properties");
	try {
		FileInputStream fis= new FileInputStream(src);
		
		 pro= new Properties();
		pro.load(fis);
	} 
	catch (Exception e)
	{
		
	}
}

public String getApplicationUrl()
{  
	String url =pro.getProperty("baseurl");
	return url;
	}

public String getUsername()
{  
	String username =pro.getProperty("username");
	return username;
	}
public String getPassword()
{  
	String pass =pro.getProperty("password");
	return pass;
	}
public String getChromePath()
{  
	String chromepath =pro.getProperty("chromepath");
	return chromepath;
	}
public String getfirefoxpath()
{  
	String firefox =pro.getProperty("firefoxpath");
	return firefox;
	}
}
