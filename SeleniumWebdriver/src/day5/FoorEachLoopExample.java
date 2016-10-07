package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FoorEachLoopExample {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement x : links)
		{
			System.out.println(x.getText());
		}
		driver.close();

	}

}














