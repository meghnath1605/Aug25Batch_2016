package day14;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindows {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
	}
	@Test
	public void windowTest()
	{
		String id1=driver.getWindowHandle();
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			String id2=driver.getWindowHandle();
			if(!id1.equals(id2))
			{
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
				break;
			}
		}
	}


}




