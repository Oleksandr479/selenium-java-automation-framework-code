package basictrackingscenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
	public static WebDriver driver = null;
	
	
	@BeforeTest
	public void datasetup() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@AfterTest
	public void commondatacleanup() {
		driver.quit();
	} 

}
