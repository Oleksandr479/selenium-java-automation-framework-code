package basictrackingscenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PrintAllLinks extends BasicTest {

	@Test
	public void printinglinks() 
	{
		driver.get("https://rozetka.com.ua/");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
	} 
}
