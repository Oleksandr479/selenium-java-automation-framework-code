package basictrackingscenario;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GitDemo extends ListenerClass {
 
	
	@Test
public void login() 
{
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
}
}
