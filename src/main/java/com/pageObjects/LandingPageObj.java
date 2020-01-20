package com.pageObjects;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPageObj {

	public WebDriver driver;
	public WebDriverWait waitDriver;
	public Actions as;
	
	public LandingPageObj(WebDriver driver) {
		
		this.driver=driver;
		waitDriver = new WebDriverWait(driver,15);	
		as = new Actions(driver);
	}	
	
	By imgFirstProduct=By.xpath("//a[@data-id-product='1']");
	By btnContShopping=By.cssSelector("span[title*='Continue shopping']");	
	By imgSecondProduct=By.xpath("//a[@data-id-product='2']");
	By drpDwnViewShppingCrt=By.xpath("//a[contains(@title,'View my shopping cart')]");
	By btnChkOut = By.xpath("//a[@id='button_order_cart']");
	
	//Shopping Cart Summary Page
	By btnShppingCrt=By.xpath("//a[@id='button_order_cart']");
	By btnContToCheckout=By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium");
	
	//SigninPage
	By txtEmailId=By.id("email");
	By txtEmailPasswd =By.id("passwd");
	By btnLogin=By.id("SubmitLogin");
	
	//Address
	
	By btnContChkOut=By.cssSelector("button[name='processAddress']");
	
	
	//Shipping
	By chkTermsCond=By.id("cgv");
	By btnCntShipng = By.cssSelector("button[name='processCarrier']");
	
	//Payment
	By btnBankWire=By.cssSelector(".bankwire");
	
	//Order Summary
	By btnCnfrmOrd=By.xpath("//*[@id='cart_navigation']/button");
	
	
	
	
	//Return items based on selection
	public WebElement getProduct(int itmNmbr) throws InterruptedException {
		 
		if(itmNmbr == 1) {
			//waitDriver.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(imgFirstProduct));
			as.moveToElement(driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]"))).build().perform();
			return driver.findElement(imgFirstProduct);
			
		}else if(itmNmbr ==2) {
			
			//waitDriver.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='homefeatured']/li[2]")));
			Thread.sleep(2000);
			as.moveToElement(driver.findElement(By.xpath("//*[@id='homefeatured']/li[2]"))).build().perform();
			return driver.findElement(imgSecondProduct);
			
		}else {
			return null;
		} 		
	}
	
	
	//Return Continue Shopping Button
	public WebElement getContShopping() {
		
		
		waitDriver.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[title*='Continue shopping']")));
		return driver.findElement(btnContShopping);	
	}
	
	//Return Continue Shopping Cart 
	public WebElement getViewShppngCart() throws InterruptedException {
		as.moveToElement(driver.findElement(By.xpath("//a[contains(@title,'View my shopping cart')]"))).build().perform();	
		driver.findElement(drpDwnViewShppingCrt);
		Thread.sleep(2000);
		return driver.findElement(btnChkOut);	
		
	}
	
	public WebElement getCheckout() {
		//as.moveToElement(driver.findElement(By.xpath("//a[contains(@title,'View my shopping cart')]"))).build().perform();
		return driver.findElement(btnContToCheckout);	
	}
	
}
