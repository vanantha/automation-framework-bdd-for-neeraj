package com.FrameworkHelpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverHelper {
	public WebDriver driver;
	public WebDriverWait waitDriver;
	public Properties prop;
	public FileInputStream fis;
	
	public WebDriver initializeDriver() throws IOException
	{
		initializeProperties();
		String browserName=prop.getProperty("browser");
		String url=prop.getProperty("url");
		System.out.println(browserName);

		if(browserName.equals("chrome"))
			{
				//execute in chrome driver
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\chromedriver.exe");
				driver= new ChromeDriver();	
	
			}
		else if (browserName.equals("firefox"))
		{
			  //execute in firefox
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\geckodriver.exe");
			File pathBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
			DesiredCapabilities desired = DesiredCapabilities.firefox();
			FirefoxOptions options = new FirefoxOptions();
			desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
			driver = new FirefoxDriver(options);
			
		}
		else if (browserName.equals("IE"))
		{
			//	IE code
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;


}
	
public void initializeProperties() throws IOException {
	prop= new Properties();
	fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");
	prop.load(fis);
}

public void getScreenshot(String result) throws IOException
{	//todo: implement screen shot
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(src, new File("E:\\Woolies\\WooliesX-Automation_Venugopal\\ScreenShots\\screenshot.png"));
	
}

public WebDriverWait getWebdriverWait(WebDriver driver) throws IOException
{
	waitDriver= new WebDriverWait(driver,15);
	return waitDriver;
	
}

public void tearDown()
{
	if(driver !=null) {
		
		driver.close();
		driver.quit();
	}
	driver=null;
}
}
