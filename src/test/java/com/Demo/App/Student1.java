package com.Demo.App;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class Student1 {
	@Test
	public void Student() throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\AutomationProject\\chromedriver\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://quiz.hematitecorp.com/#/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-z7k749']")).getText());
		driver.findElement(By.xpath("//button[@id='basic-menu']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Student']")).click();
		System.out.println(driver.findElement(By.xpath("//h4[normalize-space()='Student Registration']")).getText());
		driver.findElement(By.name("fname")).sendKeys("Jindesh");
		driver.findElement(By.name("lname")).sendKeys("Patil");
		driver.findElement(By.name("email")).sendKeys("jindeshpatil11@gmail.com");
		driver.findElement(By.name("contact")).sendKeys("8989898989");
		driver.findElement(By.name("password")).sendKeys("Qaz@1234");
		driver.findElement(By.name("password2")).sendKeys("Qaz@1234");
		driver.findElement(By.xpath("//div[@id='demo-simple-select-autowidth-label']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Student']")).click();
		driver.findElement(By.xpath("//input[@value='Branch']")).click();
		 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    ((RemoteWebDriver) jsExecutor).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='gender' and @value='male']")));
         WebElement element = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
         JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
 	    ((RemoteWebDriver) jsExecutor).executeScript("arguments[0].click();",element);
 	    System.out.println("student registered successfully");
 	    driver.quit();
	}
 
}
