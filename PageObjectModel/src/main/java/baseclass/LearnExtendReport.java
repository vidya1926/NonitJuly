package baseclass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtendReport {

	public static void main(String[] args) {
		
		ExtentHtmlReporter report=new ExtentHtmlReporter("./report/result.html");
		report.setAppendExisting(true);
		ExtentReports extent=new ExtentReports();	
		extent.attachReporter(report);
		
		
		
		ExtentTest test = extent.createTest("ReporterClass","Learning Reporter");
		test.assignAuthor("Vidya");
		test.assignCategory("Functional");
		test.pass("Test Passed");
		extent.flush();
		
	}

}
