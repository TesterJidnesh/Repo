package com.Demo.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminPage {
	@Test
	public void adminPage() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\AutomationProject\\chromedriver\\chromedriver.exe ");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://quiz.hematitecorp.com/#/");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		        Thread.sleep(10000);
		        driver.findElement(By.xpath("//input[@aria-invalid='false']")).sendKeys("Shadab");
			    driver.findElement(By.xpath("//span[contains(text(),'Registered Student')]")).click();
			    driver.findElement(By.xpath("//span[contains(text(),'Enquiry')]")).click();
			    driver.findElement(By.xpath("//span[contains(text(),'Employee')]")).click();
			    driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		        driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("sam");
		        driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("Patel");
		        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jidneshpatil67@gmail.com");
		        driver.findElement(By.xpath("//input[@name=\"contact\"]")).sendKeys("8989898989");
		        driver.findElement(By.xpath("//div[@id='role']")).click();
		        driver.findElement(By.xpath("//li[@data-value=\"trainer\"]")).click();
		        driver.findElement(By.xpath("//div[@aria-labelledby='department-label department']")).click();
		        driver.findElement(By.xpath("//li[@role='option']")).click();
		        driver.findElement(By.xpath("//div[@id='designation']")).click();
		        driver.findElement(By.xpath("//li[@role='option']")).click();
		        driver.findElement(By.xpath("//div[@id='shift']")).click();
		        driver.findElement(By.xpath("//ul[@aria-labelledby='shift-label']")).click();
		        driver.findElement(By.xpath("//div[@id='status']")).click();
		        driver.findElement(By.xpath("//li[@data-value='active']")).click();
		        driver.findElement(By.xpath("//input[@name=\"dob\"]")).sendKeys("11/05/1998");
		        driver.findElement(By.xpath("//input[@name=\"employeeId\"]")).sendKeys("113");
		        driver.findElement(By.xpath("//input[@name='joinDate']")).sendKeys("1/13/2025");
		        driver.findElement(By.xpath("//input[@value=\"male\"]")).click();
		        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		        driver.findElement(By.xpath("//span[contains(text(),'Voucher')]")).click();
			    driver.findElement(By.xpath("//span[contains(text(),'Feedback')]")).click();
			    
			    
			    driver.quit();
			}


}
