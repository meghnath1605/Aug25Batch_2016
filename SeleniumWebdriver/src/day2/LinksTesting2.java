package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting2 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		String expurl="http://www.bing.com/?scope=video&FORM=Z9LH2";
		String acturl=driver.findElement(By.linkText("Videos"))
				                           .getAttribute("href");
		if(expurl.equals(acturl))
		{
			System.out.println("Videos links is working correctly");
		}
		else
		{
			System.out.println("Videos links is not working correctly");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.linkText("Videos")).click();
		String acturl=driver.getCurrentUrl();
		if(expurl.equals(acturl))
		{
			System.out.println("Videos links is working correctly");
		}
		else
		{
			System.out.println("Videos links is not working correctly");
		}
		driver.close();*/

	}

}
