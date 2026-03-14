package sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.linkText("Forgot Password?")).getAttribute("href"));
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		System.out.println(driver.findElement(By.linkText("New User Register Here")).getAttribute("href"));
		driver.findElement(By.linkText("New User Register Here")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		 
		Thread.sleep(3000);
	    
		System.out.println(driver.findElement(By.linkText("Go to Build 2 ")).getAttribute("href"));
		driver.findElement(By.linkText("Go to Build 2 ")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		
		driver.findElement(By.linkText("info@adactin.com")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	
		driver.quit();
		}

}
