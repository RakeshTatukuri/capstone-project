package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HRMRequirements {

	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2500);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[starts-with(.,\"Admin\")]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//li[contains(.,\"User Management\")]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[contains(.,\"Users\")]")).click();
		Thread.sleep(2500);
		/*driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("David.Morris");
		Thread.sleep(2500);
	    driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[1]")).sendKeys("ESS");
		driver.findElement(By.xpath("//span[starts-with(text(),\"ESS\")]")).click();
		Thread.sleep(2500);
		//driver.findElement(By.xpath("//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]")).sendKeys("David Morris");
	  //  driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("David Morris");
		driver.findElement(By.xpath("//div[@class=\"oxd-select-text oxd-select-text--focus\"]")).sendKeys("Enabled");
	    driver.findElement(By.xpath("//span[starts-with(text(),\"Enabled\")]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();*/
		
		/*Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		Thread.sleep(2500);
        driver.findElement(By.xpath("(//div[starts-with(text(),\"-- Select --\")])[1]")).sendKeys("ESS");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//span[contains(text(),\"ESS\")]")).click();
        
        driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("David Morris");
		driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[2]")).sendKeys("Enabled");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[starts-with(text(),\"Enabled\")]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("David Morris");
	    Thread.sleep(2500);
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("DavidMorris1");
	Thread.sleep(2500);
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("DavidMorris1");
	Thread.sleep(2500);

	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
	Thread.sleep(2500);*/
	
	driver.findElement(By.xpath("(//i[@class=\"oxd-icon bi-trash\"])[1]")).click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("(//button[normalize-space()='Yes, Delete'])[1]")).click();

	
	
	}
	
}