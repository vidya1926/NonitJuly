package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod2;

public class Loginpage extends ProjectSpecificMethod2 {

	public Loginpage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public Loginpage enterUsername(String uname) throws IOException {

		try {
			driver.findElement(By.id("username")).sendKeys(uname);
			reportStep("pass", "Username entered successfully");
		} catch (Exception e) {
			reportStep("fail", "Username is not entered successfully");
		}
		return this;
	}

	public Loginpage enterPassword(String pwd) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(pwd);
			reportStep("pass", "password entered successfully");
		} catch (Exception e) {
			reportStep("fail", "password not entered successfully");
		}

		return this;
	}

	public WelcomePage clickLogin() throws IOException {
		try {
			driver.findElement(By.className("corativeSubmit")).click();
			reportStep("pass", "Login button is clicked successfully");
		} catch (Exception e) {
			reportStep("fail", "Login button is not clicked successfully");
		}
		return new WelcomePage(driver);

	}

}
