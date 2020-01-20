package com.stepDefinations;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.FrameworkHelpers.DriverHelper;
import com.pageObjects.AddressPageObj;
import com.pageObjects.LandingPageObj;
import com.pageObjects.OrdSummryPageObj;
import com.pageObjects.PaymentPageObj;
import com.pageObjects.ShippingPageObj;
import com.pageObjects.SignInPageObj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderItemStep extends DriverHelper{
	
	public WebDriver driver;
	public Actions as;
	public WebDriverWait driverWait;
	private LandingPageObj landing;
	private SignInPageObj signIn;
	private AddressPageObj address;
	private ShippingPageObj shipping;
	private PaymentPageObj payment;
	private OrdSummryPageObj orderSmry;
	private static Logger Log = LogManager.getLogger(OrderItemStep.class.getName());
	public OrderItemStep() throws IOException {
		
		 Log.debug(" Inside Class Initializer..");
		 
		 driver=initializeDriver();
		 driverWait = new WebDriverWait(driver,15);
		 //driverWait=getWebdriverWait(driver);
		 as = new Actions(driver);
		
		 landing = new LandingPageObj(driver);
		 signIn = new SignInPageObj(driver);
		 address = new AddressPageObj(driver);
		 shipping = new ShippingPageObj(driver,driverWait);
		 payment = new PaymentPageObj(driver);
		 orderSmry = new OrdSummryPageObj(driver);
		 
		 Log.debug(" Class Initialized Successfully.");
		 Log.error("Error in initialization");
	}
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		Log.debug(" Calling getProduct(1)");
		landing.getProduct(1).click();
		
	   
	}

	@When("^The user wants to place order$")
	public void the_user_wants_to_place_order() throws Throwable {
	 
	}

	@And("^He selects items from the displayed list of items$")
	public void he_selects_items_from_the_displayed_list_of_items() throws Throwable {
		Log.debug(" Calling getContShopping()");
		landing.getContShopping().click();
		Log.debug(" Calling getProduct(2)");
		landing.getProduct(2).click();
		Log.debug(" Calling getContShopping()");
		landing.getContShopping().click();
		
	}

	@And("^He checks his shopping cart$")
	public void he_checks_his_shopping_cart() throws Throwable {
		Log.debug(" Calling getViewShppngCart()");
		landing.getViewShppngCart().click();
		
	}

	@And("^He does a check out$")
	public void he_does_a_check_out() throws Throwable {
		Log.debug(" Calling getCheckout()");
		landing.getCheckout().click();
		
	}

	@And("^He logins with this credentials$")
	public void he_logins_with_this_credentials() throws Throwable {
		
		signIn.getEmailId().sendKeys(prop.getProperty("emailId"));
		Log.debug(" Email Id entered successfully.");
	}

	@And("^enters his address$")
	public void enters_his_address() throws Throwable {
		Log.debug(" Entering passwd");
		signIn.getPasswd().sendKeys(prop.getProperty("passwd"));
		signIn.getSignIn().click();
		Log.debug(" User Logged in successfully.");
		
	}

	@And("^He confirms terms and conditions$")
	public void he_confirms_terms_and_conditions() throws Throwable {
		Log.debug("Started confirming terms and conditions");
		address.getProcessAddress().click();
		shipping.getChcTrmsCond().click();
		shipping.getPrcssCarrier().click();
		Log.debug(" User confirmed terms and conditions Successfully");
		
	}

	@And("^pays for the items$")
	public void pays_for_the_items() throws Throwable {
		Log.debug(" User starting payment process");
		payment.getBankWire().click();
		Log.debug(" User completed payment via wire Successfully");
		
	}

	@Then("^He confirms his order$")
	public void he_confirms_his_order() throws Throwable {
		orderSmry.getCnfrOrd().click();
		Log.debug(" User confirmed order Successfully");
	}

	@And("^checks if the order is places successfully$")
	public void checks_if_the_order_is_places_successfully() throws Throwable {
		Log.debug(" Order is placed successfully.");
		tearDown();
	    
	}



}
