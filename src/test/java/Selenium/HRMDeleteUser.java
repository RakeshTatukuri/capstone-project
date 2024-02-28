package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMDeleteUser {

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

		driver.findElement(By.xpath("(//i[@class=\"oxd-icon bi-trash\"])[5]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='Yes, Delete'])[1]")).click();

	}

}
