package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTesting6 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		
		WebElement drop1=	driver.findElement(By.id("location"));
		
		List<WebElement>allItems1=drop1.findElements(By.tagName("option"));
		
		System.out.println("No of Items in Location "+allItems1.size());
		
		for(WebElement Items:allItems1)
		{
			System.out.println(Items.getText());
		}
		
		WebElement drop2=driver.findElement(By.id("hotels"));
		
		List<WebElement>allItems2=drop2.findElements(By.id("hotels"));
		
		System.out.println("No of items in Hotel "+allItems2.size());
		
		for(WebElement Items2:allItems2)
		{
			System.out.println(Items2.getText());
		}
		
		WebElement drop3=driver.findElement(By.id("room_type"));
		
		List<WebElement> allItems3=drop3.findElements(By.tagName("option"));
		
		System.out.println("No of Items in room_type " +allItems3.size());
		
		for(WebElement Items3: allItems3)
		{
			System.out.println(Items3.getText());
		}
		
		driver.quit();
		

	}

}
