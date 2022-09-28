package week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Login page
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> uname = driver.findElements(By.className("inpuLogin"));
	for (int i = 0; i < uname.size(); i++) {
		uname.get(i).click();
	}
		
		// WelcomePage
		
		
		
		
		
		
		
		
		
		WebElement crm = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		String text = crm.getText();
		System.out.println(text);
		crm.click();
		// To Click Leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// to click CreateLead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		// Enter the Company name, First name and Last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TL");
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstName']"));
		fname.sendKeys("Hari");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
