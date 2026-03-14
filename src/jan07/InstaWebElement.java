package jan07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaWebElement {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id)
		
	}

}
