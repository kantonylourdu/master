package com.leafBot.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class FindLeads extends ProjectSpecificMethods{
	
	public FindLeads EnterFirstnametosearch(String fname)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fname);
		return this;
	}
	
	public FindLeads clickFindsearch()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return this;
	}

	public FindLeads clickFindFirstRow()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return this;
	}


}
