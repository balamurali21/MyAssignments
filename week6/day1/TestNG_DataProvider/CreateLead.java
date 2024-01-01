package week6.day1.TestNG_DataProvider;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead {

@Test(dataProvider = "fetchdata")
	public void runCreateLead(String compname, String fname, String lname, String mobNo) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(mobNo);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}

@DataProvider (name="fetchdata")
public String[][] getData() {
	
	String[][] data=new String[2][4];
	
	data[0][0]="TCS";
	data[0][1]="Murali";
	data[0][2]="Krishnan";
	data[0][3]="9876543210";
	
	data[1][0]="Wipro";
	data[1][1]="Siva";
	data[1][2]="Ranjini";
	data[1][3]="8765432109";
	
	return data;
}
}