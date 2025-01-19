package Demo.quiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
public class EmpPage {

	public static <JavascriptExecutor> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\AutomationProject\\chromedriver\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("http://quiz-fe-test.hematitecorp.com/#/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@aria-label='Employee']")).click();
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
        driver.findElement(By.xpath("//input[@name=\"employeeId\"]")).sendKeys("112");
        driver.findElement(By.xpath("//input[@value=\"male\"]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Logout']")).click();
        driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall css-2nc5gr']")).click();
        driver.findElement(By.xpath("//button[@id='basic-menu']")).click();
        driver.findElement(By.xpath("//li[normalize-space()='Employee']")).click();
        driver.findElement(By.xpath("//input[@name='employeeId']")).sendKeys("112");
        driver.findElement(By.xpath("//input[@name='password']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Qaz@1234");
        driver.findElement(By.xpath("//input[@name='password2']")).sendKeys("Qaz@1234");
       // Thread.sleep(10000);
       // driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionSticky css-1c7ezt4']//button[1]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jidneshpatil67@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qaz@1234");
		 driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//button[@aria-label='delete']")).click();
		 driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//button[normalize-space()='Exam']")).click();
		 driver.findElement(By.xpath("//input[@name='examName']")).sendKeys("Testing testing");
		 driver.findElement(By.xpath("//input[@name='examTime']")).sendKeys("60min");
		 driver.findElement(By.xpath("//input[@name='totalQuestion']")).sendKeys("60");
		 driver.findElement(By.xpath("//button[normalize-space()='Add Exam']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//span[normalize-space()='Question']")).click();
		 driver.findElement(By.xpath("//div[@id='demo-simple-select-autowidth-label']")).click();
		 driver.findElement(By.xpath("//li[normalize-space()='Testing testing']")).click();
		 driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		 driver.findElement(By.xpath("//input[@id=':r29:']")).sendKeys("What is Java?");
		 driver.findElement(By.xpath("//input[@id=':r2a:']")).sendKeys("Code");
		 driver.findElement(By.xpath("//input[@id=':r2b:']")).sendKeys("digit");
		 driver.findElement(By.xpath("//input[@id=':r2c:']")).sendKeys("Language");
		 driver.findElement(By.xpath("//input[@id=':r2d:']")).sendKeys("All of the above");
		 driver.findElement(By.xpath("//div[@id='answer']")).click();
		 driver.findElement(By.xpath("//li[normalize-space()='Option4']")).click();
		 driver.findElement(By.xpath("//div[@id='question-level']")).click();
		 driver.findElement(By.xpath("//li[normalize-space()='Simple']")).click();
		 driver.findElement(By.xpath("//input[@id=':r2e:']")).sendKeys("1");
		 driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		 //driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-r90ol0']")).click();
		 driver.findElement(By.xpath("//button[normalize-space()='Logout']")).click();
		 driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall css-2nc5gr'][normalize-space()='Logout']")).click();
		 
      }

}