package facebooklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethds {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
		System.out.println();
		System.out.println(driver.getWindowHandle());
		System.out.println();
		System.out.println(driver.getPageSource());
		
		System.out.println("reverse string using Streams");
		System.out.println("reverse string using Streams");
		System.out.println("reverse string using Streams");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
