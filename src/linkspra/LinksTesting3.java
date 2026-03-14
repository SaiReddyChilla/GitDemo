package linkspra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting3 {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement block=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[3]/footer/div/div[3]/div[1]/div[4]"));
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		System.out.println("no of links "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			WebElement links=allLinks.get(i);
		
			System.out.println(links.getAttribute("href"));
			links.click();
			Thread.sleep(3000);
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().back();
			
			block=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[3]/footer/div/div[3]/div[1]/div[4]"));
			allLinks=driver.findElements(By.tagName("a"));
			
			Thread.sleep(3000);
		}
		driver.quit();
	}

}
