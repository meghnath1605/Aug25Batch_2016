package day25.testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day25.pageclasses.WelcomeMercuryTours;

public class TestCase1 {
	@Test
	public void loginTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		
		wm.findAFlight("Admin","admin");
	}

}





