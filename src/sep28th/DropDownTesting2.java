package sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTesting2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/?ie=UTF8&useRedirectOnSuccess=1&ref_=dex_glow_signin&path=/&");
		
		driver.manage().window().maximize();
		
		/*WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
	     Select s1 =new Select(drop);
	     
	     s1.selectByIndex(11); */
		
		//new Select(driver.findElement(By.id("searchDropdownBox"))).selectByIndex(11);
		
		//new Select(driver.findElement(By.id("searchDropdownBox"))).selectByValue("search-alias=stripbooks");
		
		new Select(driver.findElement(By.id("search-alias=stripbooks"))).selectByVisibleText("Books"); 
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry poters");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
