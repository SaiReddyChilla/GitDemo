package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClick {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
	Thread.sleep(3000);
	}
	
	
	@Test
	public void doubleClickTest()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//button[text()='Login to Account']")))
		//.moveToElement(driver.findElement(By.xpath("//a[text()='Double Click']"))).doubleClick()
		.pause(2000)
		/*.moveToElement(driver.findElement(By.xpath("//button[text()='Double Click']"))).doubleClick()
		.moveToElement(driver.findElement(By.xpath("//button[text()='Double Click']"))).doubleClick()
		.moveToElement(driver.findElement(By.xpath("//button[text()='Double Click']"))).doubleClick()
		.moveToElement(driver.findElement(By.xpath("//button[text()='Double Click']"))).doubleClick()
		.moveToElement(driver.findElement(By.xpath("//button[text()='Double Click']"))).doubleClick()*/

		.build()
		.perform();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
	//	driver.quit();
	}

}
