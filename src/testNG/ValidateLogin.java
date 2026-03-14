package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateLogin {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
	 driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();		
	}
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	@Test
	public void validateLoginUsingValidCredentials()
	{
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		driver.findElement(By.id("login")).click();
		
		Assert.assertEquals(driver.getTitle(),"Adactin.com - Search Hotel");
	}
	
	@Test
	public void validateLoginUsingInvalidCredentials()
	{
		driver.findElement(By.id("username")).sendKeys("reyaz0809");
	}
	
	
}
