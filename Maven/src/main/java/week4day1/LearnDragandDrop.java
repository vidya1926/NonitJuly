package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		WebElement resize = driver.findElement(By.xpath("//img[@id='form:logo']/following-sibling::div[1]"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(resize).perform();
		act.clickAndHold(resize).moveByOffset(30,20).perform();
		
	}

}
