package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPageObj {
	public WebDriver driver;
	public WebDriverWait waitDriver;
	
	
	public AddressPageObj(WebDriver driver) {
		
		this.driver=driver;
		waitDriver = new WebDriverWait(driver,15);	
	}

	By btnContChkOut=By.cssSelector("button[name='processAddress']");
	
	public WebElement getProcessAddress() {
		
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(btnContChkOut)); 	  
		return driver.findElement(btnContChkOut);	
	}
	
}
