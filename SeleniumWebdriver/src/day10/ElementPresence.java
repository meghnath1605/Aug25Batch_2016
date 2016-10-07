package day10;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementPresence {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void elementPresenceTest()
	{
		String str=driver.getPageSource();
		if(str.contains("Rajinikanth"))
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}




