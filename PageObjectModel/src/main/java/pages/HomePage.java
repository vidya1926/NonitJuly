package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod2;

public class HomePage extends ProjectSpecificMethod2{

	public HomePage(RemoteWebDriver driver) {	
		this.driver=driver;		
	}
	
	public HomePage verifyPageTitle() {
		System.out.println(driver.getTitle());
		return this;
	}
		
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
		
	}

}
