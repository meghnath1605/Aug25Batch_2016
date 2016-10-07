package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathCreation3 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://twitter.com/signup");
	}
	@Test
	public void xpathTest()
	{
		List<WebElement> myinput=driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println(myinput.size());
		String[] str={"one","two","three"};
		int j=0;
		for(int i=0;i<myinput.size();i++)
		{
			if(myinput.get(i).isDisplayed())
			{
				myinput.get(i).sendKeys(str[j]);
				j++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
