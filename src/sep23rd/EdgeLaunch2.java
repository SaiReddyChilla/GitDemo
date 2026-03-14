package sep23rd;

import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeLaunch2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		new EdgeDriver();
	}

}
