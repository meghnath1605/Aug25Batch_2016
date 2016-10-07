package day26;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmployee  extends BaseClass{
	@Test
	public void addEmployeeTest()
	{
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Sai");
		driver.findElement(By.id("middleName")).sendKeys("Krishna");
		driver.findElement(By.id("lastName")).sendKeys("G");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("2345");
		driver.findElement(By.id("btnSave")).click();
		
	}

}
