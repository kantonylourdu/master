package com.leafBot.pages;

import org.openqa.selenium.By;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage2 extends ProjectSpecificMethods {
	public Myleadspage clickleads() {
		driver.findElement(By.linkText("Leads")).click();
		return new Myleadspage();
		
	}

	/*public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}

	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		//HomePage page = new HomePage();
		return new HomePage();
	}*/

}










