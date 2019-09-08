package com.leafBot.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods{
	
	public Login()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username") WebElement eleUsername;
	public Login enterUserName(String uname) throws InterruptedException
	{
		
		//WebElement eleUsername=driver.findElementById("username");
		//eleUsername.sendKeys(uname);
		clearAndType(eleUsername,uname);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return this;
	}

	@FindBy(how=How.ID,using="password") WebElement elepwd;
	public Login EnterPassword(String pwd)
	{
		clearAndType(elepwd,pwd);
		//elepwd.sendKeys(pwd);
		
	return this;
	}
	
	@FindBy(className="decorativeSubmit") WebElement eledecorativesubmit;
	public HomePage ClickLogin()
	{
		eledecorativesubmit.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return new HomePage();
	}
	

}
