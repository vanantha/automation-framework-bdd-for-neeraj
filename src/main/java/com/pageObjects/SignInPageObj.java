package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPageObj {
	public WebDriver driver;
	public WebDriverWait waitDriver;
	
	By txtEmailId=By.id("email");
	By txtEmailPasswd =By.id("passwd");
	By btnLogin=By.id("SubmitLogin");
	
	public SignInPageObj(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public WebElement getEmailId() {
		
		return driver.findElement(txtEmailId);
	}
	
	public WebElement getPasswd() {
		
		return driver.findElement(txtEmailPasswd);
	}
	
	public WebElement getSignIn() {
			
			return driver.findElement(btnLogin);
		}
}
