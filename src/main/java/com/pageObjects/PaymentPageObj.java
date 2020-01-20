package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPageObj {
	public WebDriver driver;
	public WebDriverWait waitDriver;
	
	public PaymentPageObj(WebDriver driver) {
		
		this.driver=driver;
		waitDriver = new WebDriverWait(driver,15);
	}
	
	By btnBankWire=By.cssSelector(".bankwire");
	
	public WebElement getBankWire() {
		
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(btnBankWire)); 
		return driver.findElement(btnBankWire);	
	}
}
