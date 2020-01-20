package com.stepDefinations;

import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.FrameworkHelpers.DriverHelper;
import com.FrameworkHelpers.ListThrusday;
import com.jayway.restassured.RestAssured;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckWeatherStep extends DriverHelper {
	private static Logger Log = LogManager.getLogger(OrderItemStep.class.getName());
	String city;
	String country;
	String nextThrusday;
	String uri;
	String day;
	List<Float> resp;
	Float temp;
	public CheckWeatherStep() throws IOException {
		initializeProperties();
		uri=prop.getProperty("uri");
	}
	@Given("^I like to holiday in Sydney$")
	public void i_like_to_holiday_in_Sydney() throws Throwable {
		Log.debug("Loading City as Sydney and country as Australia ");
		city=prop.getProperty("city");
		country =prop.getProperty("country");
		Log.debug("City="+city+"  Country="+country);
	}

	@And("^I only like to holiday on Thursdays$")
	public void i_only_like_to_holiday_on_Thursdays() throws Throwable {
		Log.debug("Getting the next date for thrusday ");
		ListThrusday lt = new ListThrusday();
		//Passing 5 for thrusday as 1-sun,2-mon,3-tue,4-wed,5-thru,6-fri & 7-sat
		nextThrusday = lt.nextDayOfWeek(5);
		day= (String) nextThrusday.subSequence(8,10); 
	  
	}

	@When("^I look up the weather forecast$")
	public void i_look_up_the_weather_forecast() throws Throwable {
		Log.debug("Getting weather forecast");
		temp=(float) 10;
		RestAssured.baseURI=uri;
		 resp=given()
		.param("q", city+","+country)
		.param("units","metric")
		.param("appid", "9b2e8e2a9ef5103fd3d1e531b65e8092")
		.when()
		.get("/data/2.5/forecast")
		.then().extract().path("list.findAll{it.dt_txt==~/.*"+day+".*/}.main.temp");
	  
	}

	@Then("^I receive the weather forecast$")
	public void i_receive_the_weather_forecast() throws Throwable {
		Log.debug("Weather Forecast has been received successfully.");
	}

	@And("^the temperature is warmer than (\\d+) degrees$")
	public void the_temperature_is_warmer_than_degrees(int arg1) throws Throwable {
		Log.debug("Checking temperature in Sydney >10");
		//Asserting for temperature > 10 
		assertTrue(resp.get(0)>temp);
	   
	}

}
