package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTesting5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/?ie=UTF8&useRedirectOnSuccess=1&ref_=dex_glow_signin&path=/&");
		
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(drop);
		List<WebElement>allItems=s1.getOptions();
		System.out.println("No of links "+allItems.size());
		
		for(int i=0;i<allItems.size();i++)
		{
			WebElement Items=allItems.get(i);
			System.out.println(Items.getText());
		}
	
		driver.quit();
	}
	

}
