package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPageObj {
	public WebDriver driver;
	public WebDriverWait waitDriver;
	
	public ShippingPageObj(WebDriver driver,WebDriverWait waitDriver) {
		
		this.driver=driver;
		this.waitDriver=waitDriver;
		
	}
	
	By chkTermsCond=By.id("cgv");
	By btnCntShipng = By.cssSelector("button[name='processCarrier']");
	
	public WebElement getChcTrmsCond() {
		
		//waitDriver.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(chkTermsCond))); 
		return driver.findElement(chkTermsCond);	
	}
	
	public WebElement getPrcssCarrier() {
		 
		//waitDriver.until(ExpectedConditions.visibilityOfElementLocated(btnCntShipng));
		return driver.findElement(btnCntShipng);	
	}

}
