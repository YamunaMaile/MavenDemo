package com.pages;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;




public class baseClass {

	public static WebDriver driver;
	public static Properties prop=null;
	public static FileInputStream file=null;
	public static WebDriverWait wait;
	public static Logger logs;
	
	
	
	@BeforeSuite
	public void setup() throws IOException
	{
			//setting prop file
		 file= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\prop.properties");
		prop=new Properties();
		 prop.load(file);
		 
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/index.jsp?ec=20037&eco=1");
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	@AfterSuite
	public void cleanUp()
	{
		driver.quit();
	}
}
