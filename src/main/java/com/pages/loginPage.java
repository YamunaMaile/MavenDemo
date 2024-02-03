package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class loginPage extends baseClass{

	WebDriver driver;
	

	By logoId = By.id("logo");
	By userNameId = By.id("username");
	By passwordId = By.id("password"); // Logical id
	By userCustomDomainXpath = By.xpath("//a[contains(text(),'Use Custom ')]");

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	public Boolean visibilityOfLogo()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(logoId));
		Boolean logo=false;
		if(driver.findElement(logoId).isDisplayed())
		{
			logo=true;
		}
		return logo;
		}

	public void enterUserName(String username) {
		driver.findElement(userNameId).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordId).sendKeys(password);
	}

	public void clickUserDomain()
	{
		driver.findElement(userCustomDomainXpath).click();
	}
}
