package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownTesting4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/?ie=UTF8&useRedirectOnSuccess=1&ref_=dex_glow_signin&path=/&");
		
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement>allItems=drop.findElements(By.tagName("option"));
		
		System.out.println("no of items "+allItems.size());
		
		for(int i=0;i<allItems.size();i++)
		{
			WebElement Items=allItems.get(i);
			System.out.println(Items.getText());
	
	
		driver.quit();
	}
	

}
