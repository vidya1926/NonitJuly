package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod2;

public class ViewLeadPage extends ProjectSpecificMethod2 {

	public ViewLeadPage(RemoteWebDriver driver) {
           this.driver =driver;
           
	}	
	
	public ViewLeadPage verifyPageTitle() {
		System.out.println(driver.getTitle());
		return this;
	}

}
