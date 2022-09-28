package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod2;

public class WelcomePage extends ProjectSpecificMethod2{
	
	
	public WelcomePage(RemoteWebDriver driver) {	
		this.driver=driver;		
	}
		public HomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
			}	
	
	public Loginpage clickLogout() {		
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.getTitle());
		return new Loginpage(driver);
	 	}

}
