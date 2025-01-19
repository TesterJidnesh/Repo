package Demo.quiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
public class StudentPage {

	public static <JavascriptExecutor> void main(String[] args) throws InterruptedException {
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
	    driver.findElement(By.xpath("//header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionSticky css-1c7ezt4']//button[1]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jindeshpatil11@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qaz@1234");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id='code']")).sendKeys("AHLHYH");
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).getText());
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='demo-simple-select']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//li[normalize-space()='Testing testing']")).click();
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='MuiCardContent-root css-1qw96cp']")).getText());
        driver.findElement(By.xpath("//button[normalize-space()='Start Exam']")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//div[@class='MuiBox-root css-v55j09']")).getText());
        //Thread.sleep(100);
        driver.findElement(By.xpath("//input[@value='All of the above']")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='Submit Exam'])[1]"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        ((RemoteWebDriver) jsExecutor).executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[normalize-space()='Submit Exam'])[1]")));
        System.out.println(driver.findElement(By.xpath("(//button[normalize-space()='Submit Exam'])[1]")).getText());
        driver.findElement(By.xpath("//button[normalize-space()='submit']")).click();
       // driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
       // Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//div[@class='MuiCardContent-root css-1qw96cp']")).getText());
        driver.findElement(By.xpath("//a[normalize-space()='Click here to give feedback']")).click();
        System.out.println(driver.findElement(By.xpath("//h5[normalize-space()='Feedback Form']")).getText());
        driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("jindesh Vishwas Patil");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jindeshpatil11@gmail.com");
        driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("8989898989");
        driver.findElement(By.xpath("//input[@value='Branch']")).click();
        //driver.findElement(By.xpath("//div[@id='demo-simple-select-autowidth-label']")).click();
       // driver.findElement(By.xpath("//li[normalize-space()='Pune']")).click();
        driver.findElement(By.xpath("//input[@name='question1']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@name='question2']")).sendKeys("5");
        driver.findElement(By.xpath("//textarea[@name='question3']")).sendKeys("What do you like most abou tour services");
        driver.findElement(By.xpath("//textarea[@name='question4']")).sendKeys("What do you like most abou tour services");
        driver.findElement(By.xpath("//textarea[@name='question5']")).sendKeys("What do you like most about our services");
        
        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
        
        driver.close();
        

	}

}
