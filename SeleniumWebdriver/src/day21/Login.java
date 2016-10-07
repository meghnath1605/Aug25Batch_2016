package day21;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login  extends BaseClass{
	
	@Parameters("browser")
	@Test
	public void loginTest(String b) throws MalformedURLException
	{
		DesiredCapabilities caps=null;
		if(b.equals("chrome"))
		{
			caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "53.0");
		}
		else if(b.equals("firefox"))
		{
			caps = DesiredCapabilities.firefox();
			caps.setCapability("platform", "Linux");
			caps.setCapability("version", "45.0");
		}
		else if(b.equals("safari"))
		{
			caps = DesiredCapabilities.safari();
			caps.setCapability("platform", "OS X 10.11");
			caps.setCapability("version", "9.0");
		}
		String USERNAME = "inetsolv";
		String ACCESS_KEY = "b8fc04a9-78a3-4e5f-837c-4e6f9f41dd3e";
		String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	
		RemoteWebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}

}







