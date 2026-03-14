package sep25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods3 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=	new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	
	driver.findElement(By.linkText("New User Register Here")).click();
	
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	
	Thread.sleep(3000);
	
	System.out.println(driver.getTitle());
	
	driver.navigate().forward();
	
	Thread.sleep(3000);
	
	System.out.println(driver.getTitle());
	
	driver.navigate().to("https://www.facebook.com/login.php/");
	
	System.out.println(driver.getTitle());
	
	System.out.println("14th march 2026");
	
	Thread.sleep(3000);
	
	driver.quit();
		
		/*WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("New User Register Here")) .click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.facebook.com/login.php/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.quit();*/
	
	}

}
