package week1.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator2 {
	public static void main(String[] args) {
		
	

	WebDriverManager.chromedriver().setup();

	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);

	driver.manage().window().maximize();

	// Load to https://login.salesforce.com
	driver.get(" https://login.salesforce.com");

	// Login to https://login.salesforce.com

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
	driver.findElement(By.id("password")).sendKeys("Password#123");
	driver.findElement(By.id("Login")).click();

	// Click on Toggle menu(App Launcher)

	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

	// view all

	driver.findElement(By.xpath("//button[text()='View All']")).click();

	// Search contacts and click Contacts

	driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("contacts");

	driver.findElement(By.xpath("//p[@class='slds-truncate']//mark[1]")).click();

	// Click New

	driver.findElement(By.xpath("//div[text()='New']")).click();

	// Pick Salutation as 'Mr.'

	driver.findElement(
			By.xpath("//div[contains(@class,'slds-combobox__form-element slds-input-has-icon')]//button")).click();

	driver.findElement(By.xpath("//span[@title='Mr.']")).click();

	// Enter first name
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ram");

	// Enter last name

	driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']//input)[3]"))
			.sendKeys("Esh");

	// Enter email id
	driver.findElement(By.xpath("//label[text()='Email']/following::input"))
			.sendKeys("ramesh.s@gamil.com");

	// Create a New Account for Account Name

	driver.findElement(By.xpath("//div[@role='none']//input")).click();

	// Enter account name as 'Credits' and save

	driver.findElement(By.xpath("//span[@title='New Account']")).click();

	// Enter account name as 'Credits' and save

	driver.findElement(
			By.xpath("//div[@data-aura-class='uiInput uiInputText uiInput--default uiInput--input']//input"))
			.sendKeys("credits");

	// Click and save
	driver.findElement(By.xpath("//button[@title='Save']//span[1]")).click();
	
	}

}
