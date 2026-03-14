package sep26thPra;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("datepick_in")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("datepick_in")).sendKeys("14/02/2025");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
