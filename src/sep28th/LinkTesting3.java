package sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkTesting3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new  EdgeDriver();

		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_5mvnwh4xd3_b&adgrpid=1315017517456642&hvadid=82188861834005&hvnetw=o&hvqmt=b&hvbmt=bb&hvdev=c&hvlocint=&hvlocphy=143961&hvtargid=kwd-82189475779885:loc-90&hydadcr=5902_2377547&mcid=");	
	
	    System.out.println(driver.findElement(By.linkText("Sell on Amazon")).getAttribute("href"));
	    driver.findElement(By.linkText("Sell on Amazon")).click();
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	   // System.out.println(driver.findElement(By.className("link  button button-type-primary font-size-xlarge button-focus-default\"")).isDisplayed());
	 driver.navigate().back();
	 Thread.sleep(3000);
	 
	 System.out.println(driver.findElement(By.linkText("Sell under Amazon Accelerator")).getAttribute("href"));
	 driver.findElement(By.linkText("Sell under Amazon Accelerator")).click();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	 System.out.println(driver.findElement(By.linkText("Protect and Build Your Brand")).getAttribute("href"));
	 driver.findElement(By.linkText("Protect and Build Your Brand")).click();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	 System.out.println(driver.findElement(By.linkText("Amazon Global Selling")).getAttribute("href"));
	 driver.findElement(By.linkText("Amazon Global Selling")).click();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	 System.out.println(driver.findElement(By.linkText("Supply to Amazon")).getAttribute("href"));
	 driver.findElement(By.linkText("Supply to Amazon")).click();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	 System.out.println(driver.findElement(By.linkText("Become an Affiliate")).getAttribute("href"));
	 driver.findElement(By.linkText("Become an Affiliate")).click();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	 System.out.println(driver.findElement(By.linkText("Fulfilment by Amazon")).getAttribute("href"));
	 driver.findElement(By.linkText("Fulfilment by Amazon")).click();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	 System.out.println(driver.findElement(By.linkText("Advertise Your Products")).getAttribute("href"));
	 driver.findElement(By.linkText("Advertise Your Products")).click();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	 System.out.println(driver.findElement(By.linkText("Amazon Pay on Merchants")).getAttribute("href"));
	 driver.findElement(By.linkText("Amazon Pay on Merchants")).click();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 Thread.sleep(3000);
	 driver.navigate().back();
	 
	
	}

}
