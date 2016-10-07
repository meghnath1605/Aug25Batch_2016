package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownTesting1 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		//id of the dropdown
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		//id of the search box
		driver.findElement(By.id("twotabsearchtextbox"))
		                                       .sendKeys("Harry Potter");
		//class of search button
		driver.findElement(By.className("nav-input")).click();
	}

}




















