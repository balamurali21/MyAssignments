package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_LoginTest extends ProjectSpecificMethod {
	 
@BeforeTest
    public void setup() {
	excelfile ="LoginData";
	
}
	
@Test(dataProvider="getdata")
	public void runLogin(String uname, String pwd) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUname(uname).enterPwd(pwd).clickLogin();
		

	}
}
