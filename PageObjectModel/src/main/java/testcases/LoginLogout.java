package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod2;
import pages.Loginpage;

public class LoginLogout extends ProjectSpecificMethod2 {
	
	@BeforeTest
	public void setfileName() {
		filename="credentials";
		testName="LoginLogout";
		testDesc="Functionality of LoginLogout";
		author="Hari";
		category="Funtional";
	
	}
	
	
	@Test(dataProvider="testData")
	public void runLoginLogout(String uname,String pwd) throws IOException {	
//	Loginpage lp=new Loginpage();	
	/*
	 * lp.enterUsername(); lp.enterPassword(); lp.clickLogin(); */
	 new Loginpage(driver)
	.enterUsername(uname)
	.enterPassword(pwd)
	.clickLogin()
	.clickLogout();
	

}}

