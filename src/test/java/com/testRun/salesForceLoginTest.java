package com.testRun;


import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.pages.baseClass;
import com.pages.loginPage;


public class salesForceLoginTest extends baseClass{
	
	public Logger log=Logger.getLogger(salesForceLoginTest.class);

	
@Test
	
	public void loginToSalesForce() throws InterruptedException
	
	{
		loginPage loginPageObj=new loginPage(driver);
		
		Assert.assertTrue(loginPageObj.visibilityOfLogo(), "Sales Force Logo is not displayed");
		log.info("Verified Sales force logo successfully");
		
		 loginPageObj.enterUserName(prop.getProperty("username"));
		 log.info("Entered user name successfully");
	  loginPageObj.enterPassword(prop.getProperty("password"));
	  log.info("Entered password successfully");
	  loginPageObj.clickUserDomain();
	  log.info("clicked on user domain link successfully");
	  Thread.sleep(2000);
	}
}
