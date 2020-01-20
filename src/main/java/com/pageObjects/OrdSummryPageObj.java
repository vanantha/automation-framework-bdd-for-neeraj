package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrdSummryPageObj {
	public WebDriver driver;
	public WebDriverWait waitDriver;
	
	By btnCnfrmOrd=By.xpath("//*[@id='cart_navigation']/button");
	
	public OrdSummryPageObj(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement getCnfrOrd() {
		 
		return driver.findElement(btnCnfrmOrd);	
	}

}
