package sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownTesting1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/?ie=UTF8&useRedirectOnSuccess=1&ref_=dex_glow_signin&path=/&");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry poters");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	
	}

}
