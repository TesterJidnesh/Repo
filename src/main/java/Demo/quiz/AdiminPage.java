package Demo.quiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdiminPage {

	public static void main(String[] args) throws Throwable {
    
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
        driver.findElement(By.xpath("//input[@name=\"dob\"]")).sendKeys("11/05/1998");
        driver.findElement(By.xpath("//input[@name=\"employeeId\"]")).sendKeys("113");
        driver.findElement(By.xpath("//input[@value=\"male\"]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Voucher')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Feedback')]")).click();
	    
	    
	   // driver.close();
	}

}
