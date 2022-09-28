package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelFile;

public class ProjectSpecificMethod2 {

	public static RemoteWebDriver driver;
	public String filename;
	public static ExtentReports extent;
	public static ExtentTest test,node;
	public String testName, testDesc, author, category;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void preCondition(String browser, String url) {
		
		node= test.createNode(testName, testDesc);

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			// Remove the ChromeDriver and declare it globally..
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter report = new ExtentHtmlReporter("./report/result.html");
		report.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(report);
	}

	@BeforeClass
	public void testDetails() {
		test = extent.createTest(testName, testDesc);
		test.assignAuthor(author);
		test.assignCategory(category);
	}

	public void reportStep(String status, String message) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			node.pass(message,MediaEntityBuilder.createScreenCaptureFromPath(".././shot/snap"+takeSnap()+".jpg").build());
		} else if (status.equalsIgnoreCase("fail")) {
			node.fail(message);
		}
	}
	
	
	public int takeSnap() throws IOException {	
		int random = (int)(Math.random() *(9999999));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./shot/snap"+random+".jpg");
		FileUtils.copyFile(source, destn);
		return random;
		
	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

	@DataProvider // (name="fetchData")
	public String[][] testData() throws IOException {
		String[][] readData = ReadExcelFile.readData(filename);
		return readData;
	}

	@AfterSuite
	public void stopReport() {
		extent.flush();
	}

}
