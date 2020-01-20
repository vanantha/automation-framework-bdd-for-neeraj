package com.stepDefinations;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.FrameworkHelpers.DriverHelper;

public class test extends DriverHelper {
	
	@Test
	public void test() throws IOException, InterruptedException {
		driver=initializeDriver();
		
		//driver.findElement(By.cssSelector(selector))
		Actions as = new Actions(driver);
		as.moveToElement(driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]"))).build().perform();
		Thread.sleep(3);
		//driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]//div[2]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//a[@data-id-product='1']")).click();
		WebDriverWait d = new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[title*='Continue shopping']")));
		//driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span")).click();
		
		
		driver.findElement(By.xpath("//span[contains(@title,'Continue shopping')]")).click();
		Thread.sleep(3);
		as.moveToElement(driver.findElement(By.xpath("//*[@id='homefeatured']/li[2]"))).build().perform();
		
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-id-product='2']")));
		driver.findElement(By.xpath("//a[@data-id-product='2']")).click();
		
		d.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[title*='Continue shopping']")));
		driver.findElement(By.xpath("//span[contains(@title,'Continue shopping')]")).click();
		
		//as.moveToElement(driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a"))).build().perform();
		as.moveToElement(driver.findElement(By.xpath("//a[contains(@title,'View my shopping cart')]"))).build().perform();
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='button_order_cart']")));
		
		driver.findElement(By.xpath("//a[@id='button_order_cart']")).click();
		driver.findElement(By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium")).click();
		
		driver.findElement(By.id("email")).sendKeys("vg@gmail.com");
		//todo:password shuold be invisible.
		
		driver.findElement(By.id("passwd")).sendKeys("String12@");
		
		driver.findElement(By.id("SubmitLogin")).click();
	
		
		driver.findElement(By.cssSelector("button[name='processAddress']")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.cssSelector("button[name='processCarrier']")).click();
		driver.findElement(By.cssSelector(".bankwire")).click();
		driver.findElement(By.xpath("//*[@id='cart_navigation']/button")).click();
		
		
		
		driver.quit();
		
	}

}
