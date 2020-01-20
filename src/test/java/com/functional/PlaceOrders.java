package com.functional;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.FrameworkHelpers.DriverHelper;
import com.pageObjects.*;

public class PlaceOrders extends DriverHelper {
	
	public WebDriver driver;
	public Actions as;
	public WebDriverWait driverWait;
	
	
	@Test
	public void Validate_Ordering_Of_Two_Items() throws IOException, InterruptedException {
		
		driver=initializeDriver();
		driverWait = new WebDriverWait(driver,15);
		//driverWait=getWebdriverWait(driver);
		as = new Actions(driver);
		
		LandingPageObj landing = new LandingPageObj(driver);
		SignInPageObj signIn = new SignInPageObj(driver);
		AddressPageObj address = new AddressPageObj(driver);
		ShippingPageObj shipping = new ShippingPageObj(driver,driverWait);
		PaymentPageObj payment = new PaymentPageObj(driver);
		OrdSummryPageObj orderSmry = new OrdSummryPageObj(driver);
		
		  
		landing.getProduct(1).click();
		landing.getContShopping().click();
		landing.getProduct(2).click();
		landing.getContShopping().click();
		landing.getViewShppngCart().click();
		landing.getCheckout().click();
		signIn.getEmailId().sendKeys(prop.getProperty("emailId"));
		signIn.getPasswd().sendKeys(prop.getProperty("passwd"));
		signIn.getSignIn().click();
		address.getProcessAddress().click();
		shipping.getChcTrmsCond().click();
		shipping.getPrcssCarrier().click();
		payment.getBankWire().click();
		orderSmry.getCnfrOrd().click();
	
	}
	

}
