package com.runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {"json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter"},
        features = { "src/test/resources/features","src/test/resources/rest"},
        glue = "com.stepDefinations"    
        )
public class TestRunner extends AbstractTestNGCucumberTests{
	@BeforeClass
    public static void setup() {
		
        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir")+"\\target\\Extent_Reports\\" + strDate+".html";
		File newFile = new File(fileName);
		
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		//static report name
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("F:\\cucumber-testing-master\\ExtenReports\\extentreports.html"),false);
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/main/resources/extent-config.xml"));

        // Add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.141.59");

    }
}
