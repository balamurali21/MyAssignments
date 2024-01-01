package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_CreateLeadTest extends ProjectSpecificMethod {

@BeforeTest
    public void setup() {
	excelfile ="CreateLead";
	
}
@Test(dataProvider = "getdata")
	public void runCreateLead(String uname, String pwd, String cname, String fname, String lname) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUname(uname)
		.enterPwd(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.cName(cname)
		.fName(fname)
		.lName(lname)
		.submitCreateLead()
		.VerifyFName();
		

	}
}
	


