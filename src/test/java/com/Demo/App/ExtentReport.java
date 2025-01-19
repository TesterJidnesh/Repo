package com.Demo.App;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReport {

	ExtentReports extent;
	@BeforeTest
	public void Config() {
		
		//ExtentReport(Create Report) , ExtentSparkReporter(help to create some configuration)
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Result");
	
	    extent = new ExtentReports();
	    extent.attachReporter(reporter);
	    extent.setSystemInfo("Tester", "Jidesh Patil");
	
	}
	
	
	@Test
	public void Initialize() {
		ExtentTest test = extent.createTest("InitialDemo");
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\AutomationProject\\chromedriver\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		
	    driver.get("http://quiz-fe-test.hematitecorp.com/#/");
	    driver.getTitle();
	    driver.close();
	    test.addScreenCaptureFromBase64String("Result matches as expected");
	    //test.fail("Result do not match");  //demo how fail result will be seen
	    extent.flush();
	    
	}
}
