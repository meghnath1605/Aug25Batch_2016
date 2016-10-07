package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String exptitle="Gmail";
		driver.findElement(By.linkText("Gmail")).click();
		String actitle=driver.getTitle();
		if(exptitle.equals(actitle))
		{
			System.out.println("Gmail links is working correctly");
		}
		else
		{
			System.out.println("Gmail links is not working correctly");
		}
		driver.close();

	}

}
