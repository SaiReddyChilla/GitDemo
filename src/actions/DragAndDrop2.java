package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop2 {

	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(" https://emicalculator.net/");
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	
	public void teardown() throws InterruptedException
	{
	Thread.sleep(3000);
	driver.quit();
	}
	
	@Test(priority=1)
	
	public void emiCalculator() throws InterruptedException 
	{
		Actions action=new Actions(driver);
		
		action.dragAndDropBy(driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")), 80, 0)
	.pause(3000)	.build()
		.perform();
		
		Actions action2=new Actions(driver);
		action2.dragAndDropBy(driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")), 180,0)
		.build()
		.perform();
		
		Actions action3=new Actions(driver);
		action3.dragAndDropBy(driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")),-150,0)
		.build().perform();
		Thread.sleep(3000);
	}
	
/*	@Test(priority=2)
	public void emiCalculatorIntersetRate()
	{
	
		
		Actions action2=new Actions(driver);
		
		action2.dragAndDropBy(driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")),200,0)
		.build()
		.perform();
	}*/
	
	
}
