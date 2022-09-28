package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod2;
import pages.Loginpage;

public class CreateLead extends ProjectSpecificMethod2{
	@BeforeTest
	public void setfileName() {
		filename="Createleaddata";
		
	}
	
	@Test(dataProvider="testData")
	public void runCreateLead(String uname,String pwd,String cname,String fname,String lname) throws IOException {
		
		new Loginpage(driver)
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.verifyPageTitle()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyname(cname)
		.enterFirstname(fname)
		.enterLastname(lname)
		.clickCreate()
		.verifyPageTitle();
		
		
	}
	

}
