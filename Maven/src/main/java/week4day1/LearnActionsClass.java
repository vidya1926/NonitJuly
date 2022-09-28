package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActionsClass {
	public static void main(String[] args) {
       
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
	    WebElement findElement = driver.findElement(By.xpath("//span[text()='Did you notice?']"));
		wait.until(ExpectedConditions.textToBe(By.xpath("//span[text()='Did you notice?']"), "Did you notice?"));
		System.out.println(findElement.getText());	
		
	   
	
	
	}
}
