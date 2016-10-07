package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;

public class SliderAutomation {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		driver.manage().window().maximize();
	}
	@Test
	public void sliderTest()
	{
		
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		int x=slider.getLocation().x;
		int y=slider.getLocation().y;
		System.out.println(x+"---"+y);
		action.dragAndDropBy(slider, 45,y).build().perform();
		
		//action.doubleClick(Element to be double clicked).build().perform();
	
	}

}
