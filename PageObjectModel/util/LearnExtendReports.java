package util;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtendReports {
	public static void main(String[] args) throws IOException{
		//Setup the physical path for report
		ExtentHtmlReporter reporter =new ExtentHtmlReporter("./reports/result.html");
		
		//to keep the report history
		reporter.setAppendExisting(true);
		//Create object for ExtentReports
		ExtentReports extent=new ExtentReports();
		
		//attach data with physical path
		extent.attachReporter(reporter);
		
		//Create a test case and assign the test detail
		                                   //testName    //test description
		ExtentTest test = extent.createTest("Login","LoginTest for LeafTap Application");//ctrl+2
		test.assignCategory("smoke");
		test.assignAuthor("Bala");
		
		//step level status
		test.pass("Enter Username");//if the status pass the test will be treated as pass
		test.pass("Enter Password");//the status printed in fail
		
		//attach the screenshot ../control move back
		test.pass("click login button",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/leaf.png").build());

		//Mandatory stepleaf
		extent.flush();
		
	}
}
