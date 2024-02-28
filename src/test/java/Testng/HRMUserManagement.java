package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMUserManagement {

	WebDriver driver;

	@BeforeMethod()
	public void InitialiseBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void UserManagement() {
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  driver.findElement(By.xpath("//a[starts-with(.,\"Admin\")]")).click();
		  driver.findElement(By.xpath("//li[contains(.,\"User Management\")]")).click();
		  driver.findElement(By.xpath("//a[contains(.,\"Users\")]")).click();
		  
		  driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("David.Morris");
		  driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[1]")).sendKeys("ESS");
		  driver.findElement(By.xpath("//span[starts-with(text(),\"ESS\")]")).click();
		 
		  driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("David Morris");
		  driver.findElement(By.xpath("//div[starts-with(text(),'-- Select --')]")).sendKeys("Enabled");
		  driver.findElement(By.xpath("//span[starts-with(text(),\"Enabled\")]")).click();
		  
		  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}
	

	@AfterMethod()
	public void Teardown() {
		driver.close();
	}
}
