package day26;

import org.junit.Test;
import org.openqa.selenium.By;


public class Logout  extends BaseClass{
	@Test
	public void logoutTest()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	}
			

}
