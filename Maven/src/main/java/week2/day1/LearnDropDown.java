package week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		//Select the dropdown value for source
		//1.find the element
		//use Select class to click the element
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt=new Select(source);
		opt.selectByIndex(2);
		
		//Select the dropdown value for source
		//1.find the element
		//use Select class to click the element
		WebElement marCmpaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option=new Select(marCmpaign);
		option.selectByValue("CATRQ_AUTOMOBILE");
		Thread.sleep(2000);
		option.selectByVisibleText("Road and Track");
		
		List<WebElement> mc = driver.findElements(By.id("createLeadForm_marketingCampaignId"));
		System.out.println(mc);
		

	}

}
