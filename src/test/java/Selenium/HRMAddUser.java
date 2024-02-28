package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMAddUser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//a[starts-with(.,\"Admin\")]")).click();
		driver.findElement(By.xpath("//li[contains(.,\"User Management\")]")).click();
		driver.findElement(By.xpath("//a[contains(.,\"Users\")]")).click();

		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		driver.findElement(By.xpath("(//div[starts-with(text(),\"-- Select --\")])[1]")).sendKeys("ESS");
		driver.findElement(By.xpath("//span[contains(text(),\"ESS\")]")).click();

		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("David Morris");
		driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[2]")).sendKeys("Enabled");
		driver.findElement(By.xpath("//span[starts-with(text(),\"Enabled\")]")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("David Morris");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("DavidMorris1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("DavidMorris1");

		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();

	}

}
