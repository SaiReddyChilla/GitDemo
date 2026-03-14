package sep24th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://adactinhotelapp.com/");
		 
		 System.out.println(driver.getTitle());
		 System.out.println();
		 System.out.println(driver.getCurrentUrl());
		 System.out.println();
		 System.out.println(driver.getPageSource());
		 Thread.sleep(3000);
		 
		 driver.quit();
	}
}
/*WebDriver driver=new ChromeDriver();

driver.get("https://adactinhotelapp.com/");

System.out.println(driver.getTitle());
System.out.println();
System.out.println(driver.getCurrentUrl());
System.out.println();
System.out.println(driver.getPageSource());
Thread.sleep(3000);

//driver.close();

driver.quit();*/